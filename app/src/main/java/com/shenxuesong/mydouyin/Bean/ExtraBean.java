package com.shenxuesong.mydouyin.Bean;

import java.util.List;

public  class ExtraBean {

        private String logid;
        private long now;
        private List<?> fatal_item_ids;

        public String getLogid() {
            return logid;
        }

        public void setLogid(String logid) {
            this.logid = logid;
        }

        public long getNow() {
            return now;
        }

        public void setNow(long now) {
            this.now = now;
        }

        public List<?> getFatal_item_ids() {
            return fatal_item_ids;
        }

        public void setFatal_item_ids(List<?> fatal_item_ids) {
            this.fatal_item_ids = fatal_item_ids;
        }
    }
