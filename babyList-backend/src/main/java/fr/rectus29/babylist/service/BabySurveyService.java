package fr.rectus29.babylist.service;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BabySurveyService {


    private CacheManager cacheManager;

    @Autowired
    public BabySurveyService(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public void playcache(){
        cacheManager.getCache("myWonderfullCache").clear();
    }


    @Cacheable(cacheNames = "myWonderfullCache", key = "#indexObj.index", condition = "#indexObj.index != 2")
    public String getAString(execDto indexObj){
        log.debug("pass into method");
        return switch (indexObj.getIndex()){
            case 1 :
                yield "index 1";
            case 2 :
                yield "index 2";
            default:
                yield "index 3";
        };
    }

    @Data
    @Accessors(chain = true)
    public static class execDto{
        private int index;
    }
}
