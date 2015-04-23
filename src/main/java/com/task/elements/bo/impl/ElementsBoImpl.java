package com.task.elements.bo.impl;

import com.task.elements.bo.ElementsBo;
import com.task.elements.dao.ElementsDao;
import com.task.elements.model.Elements;

import java.util.List;

/**
 * @author Natasha Levkovich
 * @since 19.04.15
 */
public class ElementsBoImpl implements ElementsBo {

    ElementsDao elementsDao;

    public void setElementsDao(ElementsDao elementsDao) {
        this.elementsDao = elementsDao;
    }

    @Override
    public List<Elements> findAllFiles() {

        return elementsDao.findAllFiles();

    }

    @Override
    public String findTextInfaById(long id) {

        return elementsDao.findTextInfa(id);
    }

    @Override
    public List<String> findAllText() {
        return elementsDao.findAllText();
    }

    @Override
    public List<Elements> findAllParent() {

        return elementsDao.findAllParents();
    }

    @Override
    public List<Elements> findAllChild() {

        return elementsDao.findAllChilds();
    }

    @Override
    public List<Elements> findAllChildByParentID(long parentId) {
        return elementsDao.findAllChildByParentID(parentId);
    }
}