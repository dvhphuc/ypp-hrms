package com.hrms.digitalassetmanagement.service;


import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Service
@Transactional
public class DamService {
    @Autowired
    private Cloudinary cloudinary; // Inject Cloudinary instance
    @Value("${cloudinary.publicId}")
    private String publicId;
    @Value("${cloudinary.folder}")
    private String folder;

    public Map uploadFile(MultipartFile file) throws IOException {
        // Get the original file name
        String originalFileName = file.getOriginalFilename();

        // Append a unique identifier to the original file name
        String uniqueFileName = generateUniqueFileName(originalFileName);
        uniqueFileName = StringUtils.stripFilenameExtension(uniqueFileName);
        String filePath = String.format("%s/%s", folder, uniqueFileName);

        // Upload the file to Cloudinary with the unique file name
        return cloudinary.uploader().upload(file.getBytes(), ObjectUtils.asMap(publicId, filePath, "resource_type", "auto"));
    }

//    public String getFileUrl(String publicId) {
//        // Generate the URL for the file using its public ID
//        return cloudinary.url().generate(publicId);
//    }

    private String generateUniqueFileName(String fileName) {
        // Append a unique identifier (UUID) to the original file name
        return String.format("%s_%s", UUID.randomUUID(), fileName);
    }
}