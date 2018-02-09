package com.lexing360.app.lexingupdate.model;

import java.util.List;

/**
 * Created by fenglingfeng on 2018/2/2.
 */

public class UpDateModel {


    /**
     * code : 200
     * message : 操作成功
     * data : {"latest":"1.2.0","hasNew":false,"updateUrl":"http://ovfiuj23r.bkt.clouddn.com/%E4%B9%90%E7%9B%88%E8%BD%A61.2.0.apk","hide":true,"banner":[{"imageUrl":"http://ov8d5pfe4.bkt.clouddn.com/FkYYE9zJaL5aC_P9VaFfPFsePLqQ","url":"http://vehicle-dev.lexing360.com/#/share"}]}
     */

    private int code;
    private String message;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * latest : 1.2.0
         * hasNew : false
         * updateUrl : http://ovfiuj23r.bkt.clouddn.com/%E4%B9%90%E7%9B%88%E8%BD%A61.2.0.apk
         * hide : true
         * banner : [{"imageUrl":"http://ov8d5pfe4.bkt.clouddn.com/FkYYE9zJaL5aC_P9VaFfPFsePLqQ","url":"http://vehicle-dev.lexing360.com/#/share"}]
         */

        private String latest;
        private boolean hasNew;
        private String updateUrl;
        private boolean hide;
        private List<BannerBean> banner;

        public String getLatest() {
            return latest;
        }

        public void setLatest(String latest) {
            this.latest = latest;
        }

        public boolean isHasNew() {
            return hasNew;
        }

        public void setHasNew(boolean hasNew) {
            this.hasNew = hasNew;
        }

        public String getUpdateUrl() {
            return updateUrl;
        }

        public void setUpdateUrl(String updateUrl) {
            this.updateUrl = updateUrl;
        }

        public boolean isHide() {
            return hide;
        }

        public void setHide(boolean hide) {
            this.hide = hide;
        }

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public static class BannerBean {
            /**
             * imageUrl : http://ov8d5pfe4.bkt.clouddn.com/FkYYE9zJaL5aC_P9VaFfPFsePLqQ
             * url : http://vehicle-dev.lexing360.com/#/share
             */

            private String imageUrl;
            private String url;

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
