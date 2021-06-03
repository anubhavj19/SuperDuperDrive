package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
public class File {
    private Integer fileId;

    private String filename;

    private String contentType;

    private String fileSize;

    private Integer userId;

    private Blob fileData;
}
