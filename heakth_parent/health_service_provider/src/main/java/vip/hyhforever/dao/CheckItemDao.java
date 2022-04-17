package vip.hyhforever.dao;

import org.springframework.stereotype.Repository;
import vip.hyhforever.pojo.CheckItem;

//@Repository("checkItemDao")
public interface CheckItemDao {
    void add(CheckItem checkItem);
}
