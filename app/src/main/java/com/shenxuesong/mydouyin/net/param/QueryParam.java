package com.shenxuesong.mydouyin.net.param;

/**
 * 封装的公共参数
 */

public class QueryParam {

     public String retry_type;
     public String iid;
     public String device_id;
     public String ac;
     public String channel;
     public String aid;
     public String   app_name;
     public String version_code;
     public String version_name;
     public String device_platform;
     public String ssmix;
     public String device_type;
     public String device_brand;

     public String os_api;
     public String os_version;
     public String uuid;
     public String   openudid;
     public String manifest_version_code;
     public String resolution;
     public String dpi;
     public String update_version_code;
      public String language;
      public String ts;


//  _rticket=1516849735338&as=a185f4765754ca2a395107&cp=4348ab517e966ba8e1grmh&mas=00f0e8f97bdd1c96dcdfedefc70dc26152ec0c8cac9ccc864c86c6
    public QueryParam() {
         this.retry_type="no_retry";
        this.device_brand="Xiaomi";
        this.device_type="Redmi+Note+4";

        this.iid="23796080841";
        this.device_id="42386607829";
        this.ac="wifi";
        this.channel="xiaomi";
        this.aid="1128";
        this.app_name="aweme";
        this.version_code="171";
        this.version_name="1.7.1";
        this.device_platform="android";
        this.ssmix="a";
        this.os_api="23";
        this.os_version="6.0";
        this.uuid="863411038560129";
        this.openudid="87f33cdff2475c29";
        this.manifest_version_code="171";
        this.resolution="1080*1920";
        this.dpi="480";
        this.update_version_code="1712";
        this.language="zh";
        this.ts="1516849735";


    }
}
