package com.task.elements.bo;

import com.task.elements.model.Elements;

import java.util.List;

/**
 * @author Natasha Levkovich
 * @since 19.04.15
 */
public interface ElementsBo {

    List<Elements> findAllFiles(); //for files

    String findTextInfaById(long id);

    List<String> findAllText();

    List<Elements> findAllParent();

    List<Elements> findAllChild();

    List<Elements> findAllChildByParentID(long parentId);
}