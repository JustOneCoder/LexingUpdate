package com.lexing360.app.lexingupdate.model;

/**
 * Created by fenglingfeng on 2018/2/24.
 */

public class UpDatePutResponseModel {

    /**
     * code : 200
     * message : 操作成功
     * data : {"hide":null,"channel":"app","downloadUrl":"http://ovfiuj23r.bkt.clouddn.com/%E4%B9%90%E7%9B%88%E8%BD%A61.2.0.apk","id":6357113652361024043,"version":"1.2.0"}
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
         * hide : null
         * channel : app
         * downloadUrl : http://ovfiuj23r.bkt.clouddn.com/%E4%B9%90%E7%9B%88%E8%BD%A61.2.0.apk
         * id : 6357113652361024043
         * version : 1.2.0
         */

        private Object hide;
        private String channel;
        private String downloadUrl;
        private long id;
        private String version;

        public Object getHide() {
            return hide;
        }

        public void setHide(Object hide) {
            this.hide = hide;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public void setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }
}
