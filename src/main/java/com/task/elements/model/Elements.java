package com.task.elements.model;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * @author Natasha Levkovich
 * @since 19.04.15
 */
public class Elements {

    private long id;
    private String folderTitle;
    private String fileTitle;
    private long parentId;
    private String textInfa;
    private String picture;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFolderTitle() {
        return folderTitle;
    }

    public void setFolderTitle(String folderTitle) {
        this.folderTitle = folderTitle;
    }

    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getTextInfa() {
        return textInfa;
    }

    public void setTextInfa(String textInfa) {
        this.textInfa = textInfa;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getJsPicture() {
        return StringEscapeUtils.escapeHtml(StringEscapeUtils
                .escapeJavaScript(getPicture()));
    }


}