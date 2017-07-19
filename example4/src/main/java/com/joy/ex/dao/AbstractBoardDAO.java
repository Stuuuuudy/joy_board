package com.joy.ex.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by heesun on 2017. 7. 19..
 */
public abstract class AbstractBoardDAO implements BoardDAO {
    protected Log log = LogFactory.getLog(AbstractDAO.class);

    protected void printQueryId(String queryId) {
        if (log.isDebugEnabled()) {
            log.debug("\t QueryId  \t:  " + queryId);
        }
    }
}
