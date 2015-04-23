package com.task;

import com.task.elements.bo.ElementsBo;
import com.task.elements.model.Elements;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * @author Natasha Levkovich
 * @since 19.04.15
 */

@ManagedBean
@SessionScoped
public class ElementsBean implements Serializable{
 
	//DI via Spring
	ElementsBo elementsBo;

    private Elements selectedElements = new Elements();


    public String fileTitle;
    public String folderTitle;
    public long id;



    public Elements getSelectedElements() {
        return selectedElements;
    }

    public void setSelectedElements(Elements selectedElements) {
        this.selectedElements = selectedElements;
    }

    public String textInfa;

    public String getTextInfa() {
        return textInfa;
    }

    public void setTextInfa(String textInfa) {
        this.textInfa = textInfa;
    }


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

	public void setElementsBo(ElementsBo elementsBo) {
        System.out.println("elementsBean setElementsBo");
		this.elementsBo = elementsBo;
	}

    //file
    public List<Elements> getFileList(){
        return elementsBo.findAllFiles();
    }

    public List<Elements> getParentList(){
        return elementsBo.findAllParent();
    }

    public List<Elements> getChildList(){
        return elementsBo.findAllChild();
    }

    public List<Elements> getChildList(long parentId){
        if (parentId == 0) {
            return Collections.EMPTY_LIST;
//            throw new IllegalArgumentException("parentId does not exist");

        } else {
            System.out.println("getChildList parent id isn't 0");
            return elementsBo.findAllChildByParentID(parentId);
        }

    }
//
//    @GET
//    @Path("/text/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getTextInfaById(@PathParam("id") long id)  {
//        return  elementsBo.findTextInfaById(id);

//    }

    public String getTextInfaById( long id)  {
        System.out.println("elementsBean getTextInfaById");
        return elementsBo.findTextInfaById(id);

    }




}
