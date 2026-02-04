package com.example.Gpseva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Gpseva.entity.UploadedDocument;

public interface UploadedDocumentRepository 
        extends JpaRepository<UploadedDocument, Long> {
}

