package com.example.Gpseva.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "uploaded_documents")
public class UploadedDocument {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long userId;

	private String documentType;
	private String fileName;
	private String contentType;

	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] fileData;

	private LocalDateTime uploadedAt = LocalDateTime.now();

	public UploadedDocument() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UploadedDocument(Long id, Long userId, String documentType, String fileName, String contentType,
			byte[] fileData, LocalDateTime uploadedAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.documentType = documentType;
		this.fileName = fileName;
		this.contentType = contentType;
		this.fileData = fileData;
		this.uploadedAt = uploadedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	public LocalDateTime getUploadedAt() {
		return uploadedAt;
	}

	public void setUploadedAt(LocalDateTime uploadedAt) {
		this.uploadedAt = uploadedAt;
	}

}
