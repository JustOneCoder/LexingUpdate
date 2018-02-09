package com.lexing360.app.lexingupdate.model;

/**
 * Created by fenglingfeng on 2018/2/2.
 */

public class JwtModel {

    /**
     * code : 200
     * message : 操作成功
     * data : {"vendor":{"vid":"6355292140125540352","bid":"10000","parentBid":"10000","storeId":"10000","role":"PERSON","phone":"18588493852","name":null,"mail":null,"status":true,"createdDate":"1515219722000","updatedDate":"1517574295000","deviceId":"ac1566d9edf44b0299ec0c33d6621153","deviceType":"Android","msgerId":"6355292140125540353","avatar":"http://ov8d5pfe4.bkt.clouddn.com/FnJvojlGRpDZD7U6RSS9yhjQcjYL","city":"广东","wechatFriends":null,"openId":"oqEa5wmAi_NXsodmxnfu3rifaKuo","companyVerified":false,"capabilities":{"demandCreate":true},"verificationStatus":"PENDING","nickname":"领峰","wx_qrcode_url":"https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=gQGX8TwAAAAAAAAAAS5odHRwOi8vd2VpeGluLnFxLmNvbS9xLzAyZ1pYQlFGOW5kTGoxMDAwMHcwNy0AAgS3glBaAwQAAAAA"},"business":{"bid":"10000","mchName":"","displayName":null,"logo":null,"mchId":"103530004129","businessStatus":"open","province":null,"city":"无","area":"无","address":"无","principal":"","phone":"","mail":"","certType":null,"certNo":null,"contactName":null,"contactPhone":null,"srvPhone":null,"installAddr":null,"website":null,"icp":null,"wxAppid":null,"accountName":null,"accountBank":null,"accountNo":null,"bizLicense":null,"licenseValidTo":"","paymentChannels":null,"paymentBlock":null,"createdAt":null,"updatedAt":null,"btype":"无"},"tim":{"identifier":"vendor_6355292140125540353","userSig":"eJxFkFtPg0AUhP8LrxrZq4CJDw01LQQDWhrt04aW7Xa74bYsvWD871JC4*t8Mzln5sdKo9VTVtcyZ5lhWOfWiwWsx1Hml1pqzrK94XqQIaUUAXCnJ65bWZUDQABSiDAA-1DmvDRyL8fgiZd5pdkzHvIeggRARCkBmOLJ3Uox2N7f1n7w4fe6aXWSgnhFfaESe7nYBM5Z9XFRzy7d1v22ozSMxWx*FIEIiYo*7Y1a9ovs6Fybc0lUJUxTHObk4Svs8NZtbHNwcFK93o-lio2Fb5XI8DJxPceboJEFH6tCiqDnIDTp2W5XdaVh5lrzcaHfP0YGXSg_","expiredAt":"2018-07-04 14:22:02"},"jwt":"eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJsZXhpbmciLCJpYXQiOjE1MTc1NzQ0MzEsImV4cCI6MTUzMzM4NTYzMSwiZXh0cmEiOnsidmlkIjo2MzU1MjkyMTQwMTI1NTQwMzUyfX0.v7IR2MU7mpqpc1iCa-ZKrYMg6hu-YnqY2vHefSZ_au_-u2G1A5vMmVD0VfhHrvRMZDqJnaUOmdiE-LzSLNnGnw","profile":{"msgerId":"6355292140125540353","msgerType":"vendor","sex":0,"status":1,"nickname":"领峰","avatarUrl":"http://ov8d5pfe4.bkt.clouddn.com/FnJvojlGRpDZD7U6RSS9yhjQcjYL","remark":null,"city":"广东","country":null,"province":null,"language":null,"subscribeTime":null,"companyVerified":false,"verificationStatus":"PENDING","phone":"18588493852","businessCard":"http://ov8d5pfe4.bkt.clouddn.com/FqtitOXjIecjkybuMmf3g8OZ4bXj","role":"WHOLESALER","qrCodeUrl":null,"company":"乐行科技","bindingWechat":true},"lexing":false}
     */

    private int code;
    private String message;
    private DataBean data;

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    private String exception;

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
         * vendor : {"vid":"6355292140125540352","bid":"10000","parentBid":"10000","storeId":"10000","role":"PERSON","phone":"18588493852","name":null,"mail":null,"status":true,"createdDate":"1515219722000","updatedDate":"1517574295000","deviceId":"ac1566d9edf44b0299ec0c33d6621153","deviceType":"Android","msgerId":"6355292140125540353","avatar":"http://ov8d5pfe4.bkt.clouddn.com/FnJvojlGRpDZD7U6RSS9yhjQcjYL","city":"广东","wechatFriends":null,"openId":"oqEa5wmAi_NXsodmxnfu3rifaKuo","companyVerified":false,"capabilities":{"demandCreate":true},"verificationStatus":"PENDING","nickname":"领峰","wx_qrcode_url":"https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=gQGX8TwAAAAAAAAAAS5odHRwOi8vd2VpeGluLnFxLmNvbS9xLzAyZ1pYQlFGOW5kTGoxMDAwMHcwNy0AAgS3glBaAwQAAAAA"}
         * business : {"bid":"10000","mchName":"","displayName":null,"logo":null,"mchId":"103530004129","businessStatus":"open","province":null,"city":"无","area":"无","address":"无","principal":"","phone":"","mail":"","certType":null,"certNo":null,"contactName":null,"contactPhone":null,"srvPhone":null,"installAddr":null,"website":null,"icp":null,"wxAppid":null,"accountName":null,"accountBank":null,"accountNo":null,"bizLicense":null,"licenseValidTo":"","paymentChannels":null,"paymentBlock":null,"createdAt":null,"updatedAt":null,"btype":"无"}
         * tim : {"identifier":"vendor_6355292140125540353","userSig":"eJxFkFtPg0AUhP8LrxrZq4CJDw01LQQDWhrt04aW7Xa74bYsvWD871JC4*t8Mzln5sdKo9VTVtcyZ5lhWOfWiwWsx1Hml1pqzrK94XqQIaUUAXCnJ65bWZUDQABSiDAA-1DmvDRyL8fgiZd5pdkzHvIeggRARCkBmOLJ3Uox2N7f1n7w4fe6aXWSgnhFfaESe7nYBM5Z9XFRzy7d1v22ozSMxWx*FIEIiYo*7Y1a9ovs6Fybc0lUJUxTHObk4Svs8NZtbHNwcFK93o-lio2Fb5XI8DJxPceboJEFH6tCiqDnIDTp2W5XdaVh5lrzcaHfP0YGXSg_","expiredAt":"2018-07-04 14:22:02"}
         * jwt : eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJsZXhpbmciLCJpYXQiOjE1MTc1NzQ0MzEsImV4cCI6MTUzMzM4NTYzMSwiZXh0cmEiOnsidmlkIjo2MzU1MjkyMTQwMTI1NTQwMzUyfX0.v7IR2MU7mpqpc1iCa-ZKrYMg6hu-YnqY2vHefSZ_au_-u2G1A5vMmVD0VfhHrvRMZDqJnaUOmdiE-LzSLNnGnw
         * profile : {"msgerId":"6355292140125540353","msgerType":"vendor","sex":0,"status":1,"nickname":"领峰","avatarUrl":"http://ov8d5pfe4.bkt.clouddn.com/FnJvojlGRpDZD7U6RSS9yhjQcjYL","remark":null,"city":"广东","country":null,"province":null,"language":null,"subscribeTime":null,"companyVerified":false,"verificationStatus":"PENDING","phone":"18588493852","businessCard":"http://ov8d5pfe4.bkt.clouddn.com/FqtitOXjIecjkybuMmf3g8OZ4bXj","role":"WHOLESALER","qrCodeUrl":null,"company":"乐行科技","bindingWechat":true}
         * lexing : false
         */

        private VendorBean vendor;
        private BusinessBean business;
        private TimBean tim;
        private String jwt;
        private ProfileBean profile;
        private boolean lexing;

        public VendorBean getVendor() {
            return vendor;
        }

        public void setVendor(VendorBean vendor) {
            this.vendor = vendor;
        }

        public BusinessBean getBusiness() {
            return business;
        }

        public void setBusiness(BusinessBean business) {
            this.business = business;
        }

        public TimBean getTim() {
            return tim;
        }

        public void setTim(TimBean tim) {
            this.tim = tim;
        }

        public String getJwt() {
            return jwt;
        }

        public void setJwt(String jwt) {
            this.jwt = jwt;
        }

        public ProfileBean getProfile() {
            return profile;
        }

        public void setProfile(ProfileBean profile) {
            this.profile = profile;
        }

        public boolean isLexing() {
            return lexing;
        }

        public void setLexing(boolean lexing) {
            this.lexing = lexing;
        }

        public static class VendorBean {
            /**
             * vid : 6355292140125540352
             * bid : 10000
             * parentBid : 10000
             * storeId : 10000
             * role : PERSON
             * phone : 18588493852
             * name : null
             * mail : null
             * status : true
             * createdDate : 1515219722000
             * updatedDate : 1517574295000
             * deviceId : ac1566d9edf44b0299ec0c33d6621153
             * deviceType : Android
             * msgerId : 6355292140125540353
             * avatar : http://ov8d5pfe4.bkt.clouddn.com/FnJvojlGRpDZD7U6RSS9yhjQcjYL
             * city : 广东
             * wechatFriends : null
             * openId : oqEa5wmAi_NXsodmxnfu3rifaKuo
             * companyVerified : false
             * capabilities : {"demandCreate":true}
             * verificationStatus : PENDING
             * nickname : 领峰
             * wx_qrcode_url : https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=gQGX8TwAAAAAAAAAAS5odHRwOi8vd2VpeGluLnFxLmNvbS9xLzAyZ1pYQlFGOW5kTGoxMDAwMHcwNy0AAgS3glBaAwQAAAAA
             */

            private String vid;
            private String bid;
            private String parentBid;
            private String storeId;
            private String role;
            private String phone;
            private Object name;
            private Object mail;
            private boolean status;
            private String createdDate;
            private String updatedDate;
            private String deviceId;
            private String deviceType;
            private String msgerId;
            private String avatar;
            private String city;
            private Object wechatFriends;
            private String openId;
            private boolean companyVerified;
            private CapabilitiesBean capabilities;
            private String verificationStatus;
            private String nickname;
            private String wx_qrcode_url;

            public String getVid() {
                return vid;
            }

            public void setVid(String vid) {
                this.vid = vid;
            }

            public String getBid() {
                return bid;
            }

            public void setBid(String bid) {
                this.bid = bid;
            }

            public String getParentBid() {
                return parentBid;
            }

            public void setParentBid(String parentBid) {
                this.parentBid = parentBid;
            }

            public String getStoreId() {
                return storeId;
            }

            public void setStoreId(String storeId) {
                this.storeId = storeId;
            }

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public Object getName() {
                return name;
            }

            public void setName(Object name) {
                this.name = name;
            }

            public Object getMail() {
                return mail;
            }

            public void setMail(Object mail) {
                this.mail = mail;
            }

            public boolean isStatus() {
                return status;
            }

            public void setStatus(boolean status) {
                this.status = status;
            }

            public String getCreatedDate() {
                return createdDate;
            }

            public void setCreatedDate(String createdDate) {
                this.createdDate = createdDate;
            }

            public String getUpdatedDate() {
                return updatedDate;
            }

            public void setUpdatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
            }

            public String getDeviceId() {
                return deviceId;
            }

            public void setDeviceId(String deviceId) {
                this.deviceId = deviceId;
            }

            public String getDeviceType() {
                return deviceType;
            }

            public void setDeviceType(String deviceType) {
                this.deviceType = deviceType;
            }

            public String getMsgerId() {
                return msgerId;
            }

            public void setMsgerId(String msgerId) {
                this.msgerId = msgerId;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public Object getWechatFriends() {
                return wechatFriends;
            }

            public void setWechatFriends(Object wechatFriends) {
                this.wechatFriends = wechatFriends;
            }

            public String getOpenId() {
                return openId;
            }

            public void setOpenId(String openId) {
                this.openId = openId;
            }

            public boolean isCompanyVerified() {
                return companyVerified;
            }

            public void setCompanyVerified(boolean companyVerified) {
                this.companyVerified = companyVerified;
            }

            public CapabilitiesBean getCapabilities() {
                return capabilities;
            }

            public void setCapabilities(CapabilitiesBean capabilities) {
                this.capabilities = capabilities;
            }

            public String getVerificationStatus() {
                return verificationStatus;
            }

            public void setVerificationStatus(String verificationStatus) {
                this.verificationStatus = verificationStatus;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getWx_qrcode_url() {
                return wx_qrcode_url;
            }

            public void setWx_qrcode_url(String wx_qrcode_url) {
                this.wx_qrcode_url = wx_qrcode_url;
            }

            public static class CapabilitiesBean {
                /**
                 * demandCreate : true
                 */

                private boolean demandCreate;

                public boolean isDemandCreate() {
                    return demandCreate;
                }

                public void setDemandCreate(boolean demandCreate) {
                    this.demandCreate = demandCreate;
                }
            }
        }

        public static class BusinessBean {
            /**
             * bid : 10000
             * mchName :
             * displayName : null
             * logo : null
             * mchId : 103530004129
             * businessStatus : open
             * province : null
             * city : 无
             * area : 无
             * address : 无
             * principal :
             * phone :
             * mail :
             * certType : null
             * certNo : null
             * contactName : null
             * contactPhone : null
             * srvPhone : null
             * installAddr : null
             * website : null
             * icp : null
             * wxAppid : null
             * accountName : null
             * accountBank : null
             * accountNo : null
             * bizLicense : null
             * licenseValidTo :
             * paymentChannels : null
             * paymentBlock : null
             * createdAt : null
             * updatedAt : null
             * btype : 无
             */

            private String bid;
            private String mchName;
            private Object displayName;
            private Object logo;
            private String mchId;
            private String businessStatus;
            private Object province;
            private String city;
            private String area;
            private String address;
            private String principal;
            private String phone;
            private String mail;
            private Object certType;
            private Object certNo;
            private Object contactName;
            private Object contactPhone;
            private Object srvPhone;
            private Object installAddr;
            private Object website;
            private Object icp;
            private Object wxAppid;
            private Object accountName;
            private Object accountBank;
            private Object accountNo;
            private Object bizLicense;
            private String licenseValidTo;
            private Object paymentChannels;
            private Object paymentBlock;
            private Object createdAt;
            private Object updatedAt;
            private String btype;

            public String getBid() {
                return bid;
            }

            public void setBid(String bid) {
                this.bid = bid;
            }

            public String getMchName() {
                return mchName;
            }

            public void setMchName(String mchName) {
                this.mchName = mchName;
            }

            public Object getDisplayName() {
                return displayName;
            }

            public void setDisplayName(Object displayName) {
                this.displayName = displayName;
            }

            public Object getLogo() {
                return logo;
            }

            public void setLogo(Object logo) {
                this.logo = logo;
            }

            public String getMchId() {
                return mchId;
            }

            public void setMchId(String mchId) {
                this.mchId = mchId;
            }

            public String getBusinessStatus() {
                return businessStatus;
            }

            public void setBusinessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
            }

            public Object getProvince() {
                return province;
            }

            public void setProvince(Object province) {
                this.province = province;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getPrincipal() {
                return principal;
            }

            public void setPrincipal(String principal) {
                this.principal = principal;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getMail() {
                return mail;
            }

            public void setMail(String mail) {
                this.mail = mail;
            }

            public Object getCertType() {
                return certType;
            }

            public void setCertType(Object certType) {
                this.certType = certType;
            }

            public Object getCertNo() {
                return certNo;
            }

            public void setCertNo(Object certNo) {
                this.certNo = certNo;
            }

            public Object getContactName() {
                return contactName;
            }

            public void setContactName(Object contactName) {
                this.contactName = contactName;
            }

            public Object getContactPhone() {
                return contactPhone;
            }

            public void setContactPhone(Object contactPhone) {
                this.contactPhone = contactPhone;
            }

            public Object getSrvPhone() {
                return srvPhone;
            }

            public void setSrvPhone(Object srvPhone) {
                this.srvPhone = srvPhone;
            }

            public Object getInstallAddr() {
                return installAddr;
            }

            public void setInstallAddr(Object installAddr) {
                this.installAddr = installAddr;
            }

            public Object getWebsite() {
                return website;
            }

            public void setWebsite(Object website) {
                this.website = website;
            }

            public Object getIcp() {
                return icp;
            }

            public void setIcp(Object icp) {
                this.icp = icp;
            }

            public Object getWxAppid() {
                return wxAppid;
            }

            public void setWxAppid(Object wxAppid) {
                this.wxAppid = wxAppid;
            }

            public Object getAccountName() {
                return accountName;
            }

            public void setAccountName(Object accountName) {
                this.accountName = accountName;
            }

            public Object getAccountBank() {
                return accountBank;
            }

            public void setAccountBank(Object accountBank) {
                this.accountBank = accountBank;
            }

            public Object getAccountNo() {
                return accountNo;
            }

            public void setAccountNo(Object accountNo) {
                this.accountNo = accountNo;
            }

            public Object getBizLicense() {
                return bizLicense;
            }

            public void setBizLicense(Object bizLicense) {
                this.bizLicense = bizLicense;
            }

            public String getLicenseValidTo() {
                return licenseValidTo;
            }

            public void setLicenseValidTo(String licenseValidTo) {
                this.licenseValidTo = licenseValidTo;
            }

            public Object getPaymentChannels() {
                return paymentChannels;
            }

            public void setPaymentChannels(Object paymentChannels) {
                this.paymentChannels = paymentChannels;
            }

            public Object getPaymentBlock() {
                return paymentBlock;
            }

            public void setPaymentBlock(Object paymentBlock) {
                this.paymentBlock = paymentBlock;
            }

            public Object getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(Object createdAt) {
                this.createdAt = createdAt;
            }

            public Object getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(Object updatedAt) {
                this.updatedAt = updatedAt;
            }

            public String getBtype() {
                return btype;
            }

            public void setBtype(String btype) {
                this.btype = btype;
            }
        }

        public static class TimBean {
            /**
             * identifier : vendor_6355292140125540353
             * userSig : eJxFkFtPg0AUhP8LrxrZq4CJDw01LQQDWhrt04aW7Xa74bYsvWD871JC4*t8Mzln5sdKo9VTVtcyZ5lhWOfWiwWsx1Hml1pqzrK94XqQIaUUAXCnJ65bWZUDQABSiDAA-1DmvDRyL8fgiZd5pdkzHvIeggRARCkBmOLJ3Uox2N7f1n7w4fe6aXWSgnhFfaESe7nYBM5Z9XFRzy7d1v22ozSMxWx*FIEIiYo*7Y1a9ovs6Fybc0lUJUxTHObk4Svs8NZtbHNwcFK93o-lio2Fb5XI8DJxPceboJEFH6tCiqDnIDTp2W5XdaVh5lrzcaHfP0YGXSg_
             * expiredAt : 2018-07-04 14:22:02
             */

            private String identifier;
            private String userSig;
            private String expiredAt;

            public String getIdentifier() {
                return identifier;
            }

            public void setIdentifier(String identifier) {
                this.identifier = identifier;
            }

            public String getUserSig() {
                return userSig;
            }

            public void setUserSig(String userSig) {
                this.userSig = userSig;
            }

            public String getExpiredAt() {
                return expiredAt;
            }

            public void setExpiredAt(String expiredAt) {
                this.expiredAt = expiredAt;
            }
        }

        public static class ProfileBean {
            /**
             * msgerId : 6355292140125540353
             * msgerType : vendor
             * sex : 0
             * status : 1
             * nickname : 领峰
             * avatarUrl : http://ov8d5pfe4.bkt.clouddn.com/FnJvojlGRpDZD7U6RSS9yhjQcjYL
             * remark : null
             * city : 广东
             * country : null
             * province : null
             * language : null
             * subscribeTime : null
             * companyVerified : false
             * verificationStatus : PENDING
             * phone : 18588493852
             * businessCard : http://ov8d5pfe4.bkt.clouddn.com/FqtitOXjIecjkybuMmf3g8OZ4bXj
             * role : WHOLESALER
             * qrCodeUrl : null
             * company : 乐行科技
             * bindingWechat : true
             */

            private String msgerId;
            private String msgerType;
            private int sex;
            private int status;
            private String nickname;
            private String avatarUrl;
            private Object remark;
            private String city;
            private Object country;
            private Object province;
            private Object language;
            private Object subscribeTime;
            private boolean companyVerified;
            private String verificationStatus;
            private String phone;
            private String businessCard;
            private String role;
            private Object qrCodeUrl;
            private String company;
            private boolean bindingWechat;

            public String getMsgerId() {
                return msgerId;
            }

            public void setMsgerId(String msgerId) {
                this.msgerId = msgerId;
            }

            public String getMsgerType() {
                return msgerType;
            }

            public void setMsgerType(String msgerType) {
                this.msgerType = msgerType;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }

            public Object getRemark() {
                return remark;
            }

            public void setRemark(Object remark) {
                this.remark = remark;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public Object getCountry() {
                return country;
            }

            public void setCountry(Object country) {
                this.country = country;
            }

            public Object getProvince() {
                return province;
            }

            public void setProvince(Object province) {
                this.province = province;
            }

            public Object getLanguage() {
                return language;
            }

            public void setLanguage(Object language) {
                this.language = language;
            }

            public Object getSubscribeTime() {
                return subscribeTime;
            }

            public void setSubscribeTime(Object subscribeTime) {
                this.subscribeTime = subscribeTime;
            }

            public boolean isCompanyVerified() {
                return companyVerified;
            }

            public void setCompanyVerified(boolean companyVerified) {
                this.companyVerified = companyVerified;
            }

            public String getVerificationStatus() {
                return verificationStatus;
            }

            public void setVerificationStatus(String verificationStatus) {
                this.verificationStatus = verificationStatus;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getBusinessCard() {
                return businessCard;
            }

            public void setBusinessCard(String businessCard) {
                this.businessCard = businessCard;
            }

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public Object getQrCodeUrl() {
                return qrCodeUrl;
            }

            public void setQrCodeUrl(Object qrCodeUrl) {
                this.qrCodeUrl = qrCodeUrl;
            }

            public String getCompany() {
                return company;
            }

            public void setCompany(String company) {
                this.company = company;
            }

            public boolean isBindingWechat() {
                return bindingWechat;
            }

            public void setBindingWechat(boolean bindingWechat) {
                this.bindingWechat = bindingWechat;
            }
        }
    }
}
