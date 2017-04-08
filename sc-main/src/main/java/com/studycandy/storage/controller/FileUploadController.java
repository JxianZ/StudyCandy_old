package com.studycandy.storage.controller;

import com.studycandy.core.BaseController;
import com.studycandy.storage.exception.StorageException;
import com.studycandy.storage.exception.StorageFileNotFoundException;
import com.studycandy.storage.service.StorageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/file")
public class FileUploadController extends BaseController {

    private final StorageService storageService;
    private final Logger logger = Logger.getLogger(FileUploadController.class);

    @Autowired
    public FileUploadController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping("/getAll")
    public String listUploadedFiles(HttpServletResponse response) throws IOException {
        List<String> list = storageService
                .loadAll()
                .map(path ->
                        MvcUriComponentsBuilder
                                .fromMethodName(FileUploadController.class,
                                        "serveFile",
                                        path.getFileName().toString()
                                )
                                .build().toString())
                .collect(Collectors.toList());

        return ajaxReturn(response, list);
    }

    @GetMapping("/files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> serveFile(@PathVariable String filename) {
        Resource file = storageService.loadAsResource(filename);
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
                .body(file);
    }

    @PostMapping("upload")
    public String handleFileUpload(HttpServletResponse response,
                                   @RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        String filename = "";
        try {
            filename = storageService.store(file);
        } catch (StorageException e) {
            logger.debug(e);
            return ajaxReturn(response, null, e.getMessage(), 0);
        } catch (Exception e) {
            logger.warn(e);
        }
        if (filename.equals(""))
            return ajaxReturn(response, null, "Unknown Err.", -1);
        return ajaxReturn(response, filename, "Success", 1);
    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }

}
