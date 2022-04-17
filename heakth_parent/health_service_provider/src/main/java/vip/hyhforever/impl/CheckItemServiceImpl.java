package vip.hyhforever.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import vip.hyhforever.dao.CheckItemDao;
import vip.hyhforever.pojo.CheckItem;
import vip.hyhforever.service.CheckItemService;




/*
* 检查项服务
* */
@Service(interfaceClass = CheckItemService.class)
@Transactional
public class CheckItemServiceImpl implements CheckItemService {
    //注入mapper对象
    @Autowired
    private CheckItemDao checkItemDao;

    @Override
    public void add(CheckItem checkItem) {
        checkItemDao.add(checkItem);
    }
}
