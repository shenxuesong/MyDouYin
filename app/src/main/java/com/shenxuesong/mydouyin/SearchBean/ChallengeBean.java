package com.shenxuesong.mydouyin.SearchBean;

public  class ChallengeBean {


            private String schema;
            private int user_count;
            private AuthorBean author;
            private String cha_name;
            private String cid;
            private int type;
            private String desc;

            public String getSchema() {
                return schema;
            }

            public void setSchema(String schema) {
                this.schema = schema;
            }

            public int getUser_count() {
                return user_count;
            }

            public void setUser_count(int user_count) {
                this.user_count = user_count;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public String getCha_name() {
                return cha_name;
            }

            public void setCha_name(String cha_name) {
                this.cha_name = cha_name;
            }

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public static class AuthorBean {
            }
        }
