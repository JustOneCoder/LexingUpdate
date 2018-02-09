package com.lexing360.app.lexingupdate.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by fenglingfeng on 2018/2/5.
 */

public class LayoutModel implements Serializable{


    /**
     * code : 200
     * message : 操作成功
     * data : [{"messageSettingId":1,"redDot":"ONE_DISAPPEAR","avatarUrl":false,"integration":false,"firstLabelOfLineOne":{"fontType":"LARGE","textColor":"#4A4A4A","hide":false},"secondLabelOfLineOne":{"fontType":"SMALL","textColor":"#999999","hide":true},"firstLabelOfLineTwo":{"fontType":"MIDDLE","textColor":"#999999","hide":false},"secondLabelOfLineTwo":{"fontType":"MIDDLE","textColor":"#999999","hide":false},"name":"最新需求","createdAt":null,"updatedAt":"2018-01-31 20:08:08"},{"messageSettingId":2,"redDot":"ONE_DISAPPEAR","avatarUrl":false,"integration":true,"firstLabelOfLineOne":{"fontType":"LARGE","textColor":"#4A4A4A","hide":false},"secondLabelOfLineOne":{"fontType":"MIDDLE","textColor":"#999999","hide":true},"firstLabelOfLineTwo":{"fontType":"SMALL","textColor":"#999999","hide":false},"secondLabelOfLineTwo":{"fontType":"MIDDLE","textColor":"#999999","hide":false},"name":"询价","createdAt":null,"updatedAt":"2018-01-31 20:06:56"},{"messageSettingId":3,"redDot":"ONE_DISAPPEAR","avatarUrl":false,"integration":true,"firstLabelOfLineOne":{"fontType":"LARGE","textColor":"#4A4A4A","hide":false},"secondLabelOfLineOne":{"fontType":"MIDDLE","textColor":"#999999","hide":true},"firstLabelOfLineTwo":{"fontType":"SMALL","textColor":"#999999","hide":false},"secondLabelOfLineTwo":{"fontType":"MIDDLE","textColor":"#999999","hide":false},"name":"报价","createdAt":"2018-01-26 17:56:11","updatedAt":"2018-01-26 17:56:11"}]
     */

    private int code;
    private String message;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * messageSettingId : 1
         * redDot : ONE_DISAPPEAR
         * avatarUrl : false
         * integration : false
         * firstLabelOfLineOne : {"fontType":"LARGE","textColor":"#4A4A4A","hide":false}
         * secondLabelOfLineOne : {"fontType":"SMALL","textColor":"#999999","hide":true}
         * firstLabelOfLineTwo : {"fontType":"MIDDLE","textColor":"#999999","hide":false}
         * secondLabelOfLineTwo : {"fontType":"MIDDLE","textColor":"#999999","hide":false}
         * name : 最新需求
         * createdAt : null
         * updatedAt : 2018-01-31 20:08:08
         */

        private int messageSettingId;
        private String redDot;
        private boolean avatarUrl;
        private boolean integration;
        private FirstLabelOfLineOneBean firstLabelOfLineOne;
        private SecondLabelOfLineOneBean secondLabelOfLineOne;
        private FirstLabelOfLineTwoBean firstLabelOfLineTwo;
        private SecondLabelOfLineTwoBean secondLabelOfLineTwo;
        private String name;
        private Object createdAt;
        private String updatedAt;

        public int getMessageSettingId() {
            return messageSettingId;
        }

        public void setMessageSettingId(int messageSettingId) {
            this.messageSettingId = messageSettingId;
        }

        public String getRedDot() {
            return redDot;
        }

        public void setRedDot(String redDot) {
            this.redDot = redDot;
        }

        public boolean isAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(boolean avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public boolean isIntegration() {
            return integration;
        }

        public void setIntegration(boolean integration) {
            this.integration = integration;
        }

        public FirstLabelOfLineOneBean getFirstLabelOfLineOne() {
            return firstLabelOfLineOne;
        }

        public void setFirstLabelOfLineOne(FirstLabelOfLineOneBean firstLabelOfLineOne) {
            this.firstLabelOfLineOne = firstLabelOfLineOne;
        }

        public SecondLabelOfLineOneBean getSecondLabelOfLineOne() {
            return secondLabelOfLineOne;
        }

        public void setSecondLabelOfLineOne(SecondLabelOfLineOneBean secondLabelOfLineOne) {
            this.secondLabelOfLineOne = secondLabelOfLineOne;
        }

        public FirstLabelOfLineTwoBean getFirstLabelOfLineTwo() {
            return firstLabelOfLineTwo;
        }

        public void setFirstLabelOfLineTwo(FirstLabelOfLineTwoBean firstLabelOfLineTwo) {
            this.firstLabelOfLineTwo = firstLabelOfLineTwo;
        }

        public SecondLabelOfLineTwoBean getSecondLabelOfLineTwo() {
            return secondLabelOfLineTwo;
        }

        public void setSecondLabelOfLineTwo(SecondLabelOfLineTwoBean secondLabelOfLineTwo) {
            this.secondLabelOfLineTwo = secondLabelOfLineTwo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Object createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public static class FirstLabelOfLineOneBean implements Serializable{
            /**
             * fontType : LARGE
             * textColor : #4A4A4A
             * hide : false
             */

            private String fontType;
            private String textColor;
            private boolean hide;

            public String getFontType() {
                return fontType;
            }

            public void setFontType(String fontType) {
                this.fontType = fontType;
            }

            public String getTextColor() {
                return textColor;
            }

            public void setTextColor(String textColor) {
                this.textColor = textColor;
            }

            public boolean isHide() {
                return hide;
            }

            public void setHide(boolean hide) {
                this.hide = hide;
            }
        }

        public static class SecondLabelOfLineOneBean implements Serializable{
            /**
             * fontType : SMALL
             * textColor : #999999
             * hide : true
             */

            private String fontType;
            private String textColor;
            private boolean hide;

            public String getFontType() {
                return fontType;
            }

            public void setFontType(String fontType) {
                this.fontType = fontType;
            }

            public String getTextColor() {
                return textColor;
            }

            public void setTextColor(String textColor) {
                this.textColor = textColor;
            }

            public boolean isHide() {
                return hide;
            }

            public void setHide(boolean hide) {
                this.hide = hide;
            }
        }

        public static class FirstLabelOfLineTwoBean implements Serializable{
            /**
             * fontType : MIDDLE
             * textColor : #999999
             * hide : false
             */

            private String fontType;
            private String textColor;
            private boolean hide;

            public String getFontType() {
                return fontType;
            }

            public void setFontType(String fontType) {
                this.fontType = fontType;
            }

            public String getTextColor() {
                return textColor;
            }

            public void setTextColor(String textColor) {
                this.textColor = textColor;
            }

            public boolean isHide() {
                return hide;
            }

            public void setHide(boolean hide) {
                this.hide = hide;
            }
        }

        public static class SecondLabelOfLineTwoBean implements Serializable{
            /**
             * fontType : MIDDLE
             * textColor : #999999
             * hide : false
             */

            private String fontType;
            private String textColor;
            private boolean hide;

            public String getFontType() {
                return fontType;
            }

            public void setFontType(String fontType) {
                this.fontType = fontType;
            }

            public String getTextColor() {
                return textColor;
            }

            public void setTextColor(String textColor) {
                this.textColor = textColor;
            }

            public boolean isHide() {
                return hide;
            }

            public void setHide(boolean hide) {
                this.hide = hide;
            }
        }
    }
}
