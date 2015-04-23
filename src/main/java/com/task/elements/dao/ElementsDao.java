package com.task.elements.dao;

import com.task.elements.model.Elements;

import java.util.List;

/**
 * @author Natasha Levkovich
 * @since 19.04.15
 */
public interface ElementsDao {

    List<Elements> findAllFiles(); // files

    String findTextInfa(long id);

    List<String> findAllText();

    List<Elements> findAllParents();

    List<Elements> findAllChilds();

    List<Elements> findAllChildByParentID(long parentId);
}