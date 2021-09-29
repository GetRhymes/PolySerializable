package com.poly.serialize;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class MessageDTO implements Serializable {

    private String date;
    private String name;
    private String message;
    private String fileName;
    private byte[] fileContent;


    public MessageDTO(String date, String name, String message, String fileName, byte[] fileContent) {
        this.date = date;
        this.name = name;
        this.message = message;
        this.fileName = fileName;
        this.fileContent = fileContent;
    }

    public MessageDTO() {
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getFileName() {
        return fileName;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    @Override
    public String toString() {
        return "com.poly.serialize.MessageDTO{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileContent=" + Arrays.toString(fileContent) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageDTO that = (MessageDTO) o;
        return Objects.equals(date, that.date) &&
                Objects.equals(name, that.name) &&
                Objects.equals(message, that.message) &&
                Objects.equals(fileName, that.fileName) &&
                Arrays.equals(fileContent, that.fileContent);
    }
}
