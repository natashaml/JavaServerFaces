package com.task.elements.dao.impl;

import com.task.elements.dao.ElementsDao;
import com.task.elements.model.Elements;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Natasha Levkovich
 * @since 19.04.15
 */
@Component
public class ElementsDaoImpl extends
        HibernateDaoSupport implements ElementsDao {

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Elements> findAllFiles() {

        return getHibernateTemplate().find("from Elements where ParentId is null and fileTitle is not null");
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public String findTextInfa(long id) {

        return getHibernateTemplate().find("select textInfa from Elements where id = ?", id).get(0).toString();

    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<String> findAllText() {
        return getHibernateTemplate().find("select textInfa from Elements where fileTitle is not null");
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Elements> findAllParents() {
        List list = getHibernateTemplate().find("from Elements where ParentId is null and folderTitle is not null");
        return list;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Elements> findAllChilds() {
        return getHibernateTemplate().find("from Elements where ParentId is not null");
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Elements> findAllChildByParentID(long parentId) {
        return getHibernateTemplate()
                .find("FROM Elements where ParentId  = ?", parentId);

    }
}