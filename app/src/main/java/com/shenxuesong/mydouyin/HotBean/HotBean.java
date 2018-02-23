package com.shenxuesong.mydouyin.HotBean;

import java.util.List;

/**
 * Created by Dell on 2018/2/22.
 */

public class HotBean {


    private ExtraBean extra;
    private int has_more;
    private int status_code;
    private int cursor;
    private int device_type;
    private List<CategoryListBean> category_list;

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public int getHas_more() {
        return has_more;
    }

    public void setHas_more(int has_more) {
        this.has_more = has_more;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    public int getDevice_type() {
        return device_type;
    }

    public void setDevice_type(int device_type) {
        this.device_type = device_type;
    }

    public List<CategoryListBean> getCategory_list() {
        return category_list;
    }

    public void setCategory_list(List<CategoryListBean> category_list) {
        this.category_list = category_list;
    }

    public static class ExtraBean {
        /**
         * logid : 20180222200554010015026167872543
         * now : 1519301155375
         * fatal_item_ids : []
         */

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

    public static class CategoryListBean {
        /**
         * challenge_info : {"schema":"aweme://aweme/challenge/detail?cid=1592990718990343","user_count":5541,"author":{},"cha_name":"站好，喷泉表演开始了！","cid":"1592990718990343","type":0,"desc":"\u201c你把指尖聚拢，手举起来，高一点，再高一点，哎对，你给自己放了一支烟花！\u201d豆芽们是不是对这个最\u201c环保\u201d的放烟花招数非常熟悉了呢？抖音君这次推荐你一个更好玩的方法\u2014\u2014组团来玩喷泉表演！\n和你的小伙伴们站成一排，每人充当一个\u201c水柱\u201d跟着音乐的节奏，蹲下站起，表演出喷泉的波动感！这对你们之间的默契度是个大考验哦，还不快来挑战一下！抖音君给大家准备了4首推荐音乐，快来试试吧！"}
         * aweme_list : [{"label_top":{"url_list":["https://p3.pstatp.com/obj/c150000f34767e2cb56","https://pb9.pstatp.com/obj/c150000f34767e2cb56","https://pb3.pstatp.com/obj/c150000f34767e2cb56"],"uri":"c150000f34767e2cb56"},"author_user_id":57910509141,"rate":12,"create_time":1519206712,"video":{"ratio":"720p","has_watermark":true,"play_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=e878ff97707f410a8160d23e181502ee&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=e878ff97707f410a8160d23e181502ee&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"e878ff97707f410a8160d23e181502ee"},"cover":{"url_list":["https://p3.pstatp.com/aweme/300x400/679e000fa3fd364bd196.jpeg","https://pb9.pstatp.com/aweme/300x400/679e000fa3fd364bd196.jpeg","https://pb3.pstatp.com/aweme/300x400/679e000fa3fd364bd196.jpeg"],"uri":"300x400/679e000fa3fd364bd196"},"height":960,"width":540,"download_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=e878ff97707f410a8160d23e181502ee&line=0&ratio=720p&watermark=1&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=e878ff97707f410a8160d23e181502ee&line=1&ratio=720p&watermark=1&media_type=4&vr_type=0"],"uri":"e878ff97707f410a8160d23e181502ee"},"origin_cover":{"url_list":["http://p3.pstatp.com/large/67a20006bbbea4c5e0a3.jpeg","http://pb9.pstatp.com/large/67a20006bbbea4c5e0a3.jpeg","http://pb3.pstatp.com/large/67a20006bbbea4c5e0a3.jpeg"],"uri":"large/67a20006bbbea4c5e0a3"},"play_addr_lowbr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=e878ff97707f410a8160d23e181502ee&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=e878ff97707f410a8160d23e181502ee&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"e878ff97707f410a8160d23e181502ee"},"dynamic_cover":{"url_list":["https://p3.pstatp.com/obj/67a1000cf08abea3fa09","https://pb9.pstatp.com/obj/67a1000cf08abea3fa09","https://pb3.pstatp.com/obj/67a1000cf08abea3fa09"],"uri":"67a1000cf08abea3fa09"}},"aweme_id":"6524943085523176718","video_labels":[],"is_vr":false,"vr_type":1,"statistics":{"play_count":180150,"aweme_id":"6524943085523176718","comment_count":144,"share_count":62,"digg_count":3432},"cmt_swt":false,"share_url":"https://www.douyin.com/share/video/6524943085523176718/?mid=6520098020007742221","is_ads":false,"bodydance_score":0,"is_hash_tag":0,"status":{"allow_share":true,"allow_comment":true,"with_goods":false,"is_private":false,"is_delete":false},"label_large":{"url_list":["https://p9.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb1.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb3.pstatp.com/obj/330b000f63e3bf11a1f3"],"uri":"330b000f63e3bf11a1f3"},"share_info":{"share_weibo_desc":"#在抖音，分享美好生活#请勿戏水，小心触电！","share_title":"请勿戏水，小心触电！","share_url":"https://www.douyin.com/share/video/6524943085523176718/?region=CN&mid=6520098020007742221&titleType=title","share_desc":"在抖音，分享美好生活"},"is_top":0,"aweme_type":0,"desc":"请勿戏水，小心触电！","region":"","text_extra":[],"user_digged":0},{"label_top":{"url_list":["https://p3.pstatp.com/obj/c150000f34767e2cb56","https://pb9.pstatp.com/obj/c150000f34767e2cb56","https://pb3.pstatp.com/obj/c150000f34767e2cb56"],"uri":"c150000f34767e2cb56"},"author_user_id":59166572291,"rate":12,"create_time":1519219066,"video":{"ratio":"720p","has_watermark":true,"play_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=eaa3df2eeae8442b8f40f3db1c0c2b06&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=eaa3df2eeae8442b8f40f3db1c0c2b06&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"eaa3df2eeae8442b8f40f3db1c0c2b06"},"cover":{"url_list":["https://p3.pstatp.com/aweme/300x400/67ae000882de90b2d914.jpeg","https://pb9.pstatp.com/aweme/300x400/67ae000882de90b2d914.jpeg","https://pb3.pstatp.com/aweme/300x400/67ae000882de90b2d914.jpeg"],"uri":"300x400/67ae000882de90b2d914"},"height":960,"width":540,"download_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=eaa3df2eeae8442b8f40f3db1c0c2b06&line=0&ratio=720p&watermark=1&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=eaa3df2eeae8442b8f40f3db1c0c2b06&line=1&ratio=720p&watermark=1&media_type=4&vr_type=0"],"uri":"eaa3df2eeae8442b8f40f3db1c0c2b06"},"origin_cover":{"url_list":["http://p3.pstatp.com/large/67b0000153d111870eeb.jpeg","http://pb9.pstatp.com/large/67b0000153d111870eeb.jpeg","http://pb3.pstatp.com/large/67b0000153d111870eeb.jpeg"],"uri":"large/67b0000153d111870eeb"},"play_addr_lowbr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=eaa3df2eeae8442b8f40f3db1c0c2b06&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=eaa3df2eeae8442b8f40f3db1c0c2b06&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"eaa3df2eeae8442b8f40f3db1c0c2b06"},"dynamic_cover":{"url_list":["https://p3.pstatp.com/obj/67b000015442e98aafe3","https://pb9.pstatp.com/obj/67b000015442e98aafe3","https://pb3.pstatp.com/obj/67b000015442e98aafe3"],"uri":"67b000015442e98aafe3"}},"aweme_id":"6524996152520084740","video_labels":[],"is_vr":false,"vr_type":1,"statistics":{"play_count":169870,"aweme_id":"6524996152520084740","comment_count":116,"share_count":53,"digg_count":2940},"cmt_swt":false,"share_url":"https://www.douyin.com/share/video/6524996152520084740/?mid=6520098020007742221","is_ads":false,"bodydance_score":0,"is_hash_tag":0,"status":{"allow_share":true,"allow_comment":true,"with_goods":false,"is_private":false,"is_delete":false},"label_large":{"url_list":["https://p9.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb1.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb3.pstatp.com/obj/330b000f63e3bf11a1f3"],"uri":"330b000f63e3bf11a1f3"},"share_info":{"share_weibo_desc":"#在抖音，分享美好生活#我们是音乐小喷泉⛲️","share_title":"我们是音乐小喷泉⛲️","share_url":"https://www.douyin.com/share/video/6524996152520084740/?region=CN&mid=6520098020007742221&titleType=title","share_desc":"在抖音，分享美好生活"},"is_top":0,"aweme_type":0,"desc":"我们是音乐小喷泉⛲️","region":"","text_extra":[],"user_digged":0},{"label_top":{"url_list":["https://p3.pstatp.com/obj/c150000f34767e2cb56","https://pb9.pstatp.com/obj/c150000f34767e2cb56","https://pb3.pstatp.com/obj/c150000f34767e2cb56"],"uri":"c150000f34767e2cb56"},"author_user_id":70548121620,"rate":12,"create_time":1519288834,"video":{"ratio":"720p","has_watermark":true,"play_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=2352c19d060a48ba9630388d3f1b7e10&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=2352c19d060a48ba9630388d3f1b7e10&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"2352c19d060a48ba9630388d3f1b7e10"},"cover":{"url_list":["https://p1.pstatp.com/aweme/300x400/67d8000e8e51cdc02b32.jpeg","https://pb3.pstatp.com/aweme/300x400/67d8000e8e51cdc02b32.jpeg","https://pb3.pstatp.com/aweme/300x400/67d8000e8e51cdc02b32.jpeg"],"uri":"300x400/67d8000e8e51cdc02b32"},"height":960,"width":540,"download_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=2352c19d060a48ba9630388d3f1b7e10&line=0&ratio=720p&watermark=1&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=2352c19d060a48ba9630388d3f1b7e10&line=1&ratio=720p&watermark=1&media_type=4&vr_type=0"],"uri":"2352c19d060a48ba9630388d3f1b7e10"},"origin_cover":{"url_list":["http://p9.pstatp.com/large/67db000791d97fcd95ef.jpeg","http://pb1.pstatp.com/large/67db000791d97fcd95ef.jpeg","http://pb3.pstatp.com/large/67db000791d97fcd95ef.jpeg"],"uri":"large/67db000791d97fcd95ef"},"play_addr_lowbr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=2352c19d060a48ba9630388d3f1b7e10&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=2352c19d060a48ba9630388d3f1b7e10&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"2352c19d060a48ba9630388d3f1b7e10"},"dynamic_cover":{"url_list":["https://p1.pstatp.com/obj/67d70010a4e44732fa6a","https://pb3.pstatp.com/obj/67d70010a4e44732fa6a","https://pb3.pstatp.com/obj/67d70010a4e44732fa6a"],"uri":"67d70010a4e44732fa6a"}},"aweme_id":"6525295657761115399","video_labels":[],"is_vr":false,"vr_type":1,"statistics":{"play_count":887935,"aweme_id":"6525295657761115399","comment_count":377,"share_count":415,"digg_count":12860},"cmt_swt":false,"share_url":"https://www.douyin.com/share/video/6525295657761115399/?mid=6525295855375747844","is_ads":false,"bodydance_score":0,"is_hash_tag":0,"status":{"allow_share":true,"allow_comment":true,"with_goods":false,"is_private":false,"is_delete":false},"label_large":{"url_list":["https://p9.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb1.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb3.pstatp.com/obj/330b000f63e3bf11a1f3"],"uri":"330b000f63e3bf11a1f3"},"share_info":{"share_weibo_desc":"#在抖音，分享美好生活#过完年单身狗又没肉吃了😂","share_title":"过完年单身狗又没肉吃了😂","share_url":"https://www.douyin.com/share/video/6525295657761115399/?region=CN&mid=6525295855375747844&titleType=title","share_desc":"在抖音，分享美好生活"},"is_top":0,"aweme_type":0,"desc":"过完年单身狗又没肉吃了😂","region":"","text_extra":[],"user_digged":0},{"label_top":{"url_list":["https://p3.pstatp.com/obj/c150000f34767e2cb56","https://pb9.pstatp.com/obj/c150000f34767e2cb56","https://pb3.pstatp.com/obj/c150000f34767e2cb56"],"uri":"c150000f34767e2cb56"},"author_user_id":76055758243,"rate":10,"create_time":1519295756,"video":{"ratio":"720p","has_watermark":true,"play_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=87716950431d4119b0d6b9159e9a1629&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=87716950431d4119b0d6b9159e9a1629&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"87716950431d4119b0d6b9159e9a1629"},"cover":{"url_list":["https://p3.pstatp.com/aweme/300x400/67e1000a23d48070c7e7.jpeg","https://pb9.pstatp.com/aweme/300x400/67e1000a23d48070c7e7.jpeg","https://pb3.pstatp.com/aweme/300x400/67e1000a23d48070c7e7.jpeg"],"uri":"300x400/67e1000a23d48070c7e7"},"height":540,"width":960,"download_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=87716950431d4119b0d6b9159e9a1629&line=0&ratio=720p&watermark=1&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=87716950431d4119b0d6b9159e9a1629&line=1&ratio=720p&watermark=1&media_type=4&vr_type=0"],"uri":"87716950431d4119b0d6b9159e9a1629"},"origin_cover":{"url_list":["http://p9.pstatp.com/large/67df00107acb77aa4ef7.jpeg","http://pb1.pstatp.com/large/67df00107acb77aa4ef7.jpeg","http://pb3.pstatp.com/large/67df00107acb77aa4ef7.jpeg"],"uri":"large/67df00107acb77aa4ef7"},"play_addr_lowbr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=87716950431d4119b0d6b9159e9a1629&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=87716950431d4119b0d6b9159e9a1629&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"87716950431d4119b0d6b9159e9a1629"},"dynamic_cover":{"url_list":["https://p1.pstatp.com/obj/67e1000a24ba83fd60fc","https://pb3.pstatp.com/obj/67e1000a24ba83fd60fc","https://pb3.pstatp.com/obj/67e1000a24ba83fd60fc"],"uri":"67e1000a24ba83fd60fc"}},"aweme_id":"6525325398757084423","video_labels":[],"is_vr":false,"vr_type":1,"statistics":{"play_count":111030,"aweme_id":"6525325398757084423","comment_count":408,"share_count":414,"digg_count":5764},"cmt_swt":false,"share_url":"https://www.douyin.com/share/video/6525325398757084423/?mid=6525325588471450382","is_ads":false,"bodydance_score":0,"is_hash_tag":0,"status":{"allow_share":true,"allow_comment":true,"with_goods":false,"is_private":false,"is_delete":false},"share_info":{"share_weibo_desc":"#在抖音，分享美好生活#看完这个故事，你学到了什么道理？😂喜欢就给一禅点个赞吧~","share_title":"看完这个故事，你学到了什么道理？😂喜欢就给一禅点个赞吧~","share_url":"https://www.douyin.com/share/video/6525325398757084423/?region=CN&mid=6525325588471450382&titleType=title","share_desc":"在抖音，分享美好生活"},"is_top":0,"aweme_type":0,"desc":"看完这个故事，你学到了什么道理？😂喜欢就给一禅点个赞吧~","region":"","text_extra":[],"user_digged":0},{"label_top":{"url_list":["https://p3.pstatp.com/obj/c150000f34767e2cb56","https://pb9.pstatp.com/obj/c150000f34767e2cb56","https://pb3.pstatp.com/obj/c150000f34767e2cb56"],"uri":"c150000f34767e2cb56"},"author_user_id":58950716689,"rate":12,"create_time":1519294634,"video":{"ratio":"720p","has_watermark":true,"play_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=4275c3bb399d4168bddf3bee8fda201d&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=4275c3bb399d4168bddf3bee8fda201d&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"4275c3bb399d4168bddf3bee8fda201d"},"cover":{"url_list":["https://p3.pstatp.com/aweme/300x400/67df000d1de5ca2aa548.jpeg","https://pb9.pstatp.com/aweme/300x400/67df000d1de5ca2aa548.jpeg","https://pb3.pstatp.com/aweme/300x400/67df000d1de5ca2aa548.jpeg"],"uri":"300x400/67df000d1de5ca2aa548"},"height":960,"width":540,"download_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=4275c3bb399d4168bddf3bee8fda201d&line=0&ratio=720p&watermark=1&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=4275c3bb399d4168bddf3bee8fda201d&line=1&ratio=720p&watermark=1&media_type=4&vr_type=0"],"uri":"4275c3bb399d4168bddf3bee8fda201d"},"origin_cover":{"url_list":["http://p1.pstatp.com/large/67e0000ce97e9b1f13aa.jpeg","http://pb3.pstatp.com/large/67e0000ce97e9b1f13aa.jpeg","http://pb3.pstatp.com/large/67e0000ce97e9b1f13aa.jpeg"],"uri":"large/67e0000ce97e9b1f13aa"},"play_addr_lowbr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=4275c3bb399d4168bddf3bee8fda201d&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=4275c3bb399d4168bddf3bee8fda201d&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"4275c3bb399d4168bddf3bee8fda201d"},"dynamic_cover":{"url_list":["https://p1.pstatp.com/obj/67dc0010b1c33fce9878","https://pb3.pstatp.com/obj/67dc0010b1c33fce9878","https://pb3.pstatp.com/obj/67dc0010b1c33fce9878"],"uri":"67dc0010b1c33fce9878"}},"aweme_id":"6525320733667626243","video_labels":[],"is_vr":false,"vr_type":1,"statistics":{"play_count":140412,"aweme_id":"6525320733667626243","comment_count":342,"share_count":65,"digg_count":4549},"cmt_swt":false,"share_url":"https://www.douyin.com/share/video/6525320733667626243/?mid=6512238817590807303","is_ads":false,"bodydance_score":0,"is_hash_tag":0,"status":{"allow_share":true,"allow_comment":true,"with_goods":false,"is_private":false,"is_delete":false},"label_large":{"url_list":["https://p9.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb1.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb3.pstatp.com/obj/330b000f63e3bf11a1f3"],"uri":"330b000f63e3bf11a1f3"},"share_info":{"share_weibo_desc":"#在抖音，分享美好生活#196斤的黑历史第一次爆出来  以前胖到没有太多朋友 所以比别人更在意身边人的感受 更知道珍惜身边的人","share_title":"196斤的黑历史第一次爆出来  以前胖到没有太多朋友 所以比别人更在意身边人的感受 更知道珍惜身边的人","share_url":"https://www.douyin.com/share/video/6525320733667626243/?region=CN&mid=6512238817590807303&titleType=title","share_desc":"在抖音，分享美好生活"},"is_top":0,"aweme_type":0,"desc":"196斤的黑历史第一次爆出来  以前胖到没有太多朋友 所以比别人更在意身边人的感受 更知道珍惜身边的人","region":"","text_extra":[],"user_digged":0},{"label_top":{"url_list":["https://p3.pstatp.com/obj/c150000f34767e2cb56","https://pb9.pstatp.com/obj/c150000f34767e2cb56","https://pb3.pstatp.com/obj/c150000f34767e2cb56"],"uri":"c150000f34767e2cb56"},"author_user_id":64974757115,"rate":12,"create_time":1519293168,"video":{"ratio":"720p","has_watermark":true,"play_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=f696444f05364148a5ee42b70e458ed6&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=f696444f05364148a5ee42b70e458ed6&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"f696444f05364148a5ee42b70e458ed6"},"cover":{"url_list":["https://p9.pstatp.com/aweme/300x400/67dd000ae6898806ceb1.jpeg","https://pb1.pstatp.com/aweme/300x400/67dd000ae6898806ceb1.jpeg","https://pb3.pstatp.com/aweme/300x400/67dd000ae6898806ceb1.jpeg"],"uri":"300x400/67dd000ae6898806ceb1"},"height":960,"width":540,"download_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=f696444f05364148a5ee42b70e458ed6&line=0&ratio=720p&watermark=1&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=f696444f05364148a5ee42b70e458ed6&line=1&ratio=720p&watermark=1&media_type=4&vr_type=0"],"uri":"f696444f05364148a5ee42b70e458ed6"},"origin_cover":{"url_list":["http://p9.pstatp.com/large/67df0008985a2883a92a.jpeg","http://pb1.pstatp.com/large/67df0008985a2883a92a.jpeg","http://pb3.pstatp.com/large/67df0008985a2883a92a.jpeg"],"uri":"large/67df0008985a2883a92a"},"play_addr_lowbr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=f696444f05364148a5ee42b70e458ed6&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=f696444f05364148a5ee42b70e458ed6&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"f696444f05364148a5ee42b70e458ed6"},"dynamic_cover":{"url_list":["https://p9.pstatp.com/obj/67e200015dfe79496430","https://pb1.pstatp.com/obj/67e200015dfe79496430","https://pb3.pstatp.com/obj/67e200015dfe79496430"],"uri":"67e200015dfe79496430"}},"aweme_id":"6525314426692701444","video_labels":[],"is_vr":false,"vr_type":1,"statistics":{"play_count":138243,"aweme_id":"6525314426692701444","comment_count":72,"share_count":39,"digg_count":4434},"cmt_swt":false,"share_url":"https://www.douyin.com/share/video/6525314426692701444/?mid=6525314471035374343","is_ads":false,"bodydance_score":0,"is_hash_tag":0,"status":{"allow_share":true,"allow_comment":true,"with_goods":false,"is_private":false,"is_delete":false},"label_large":{"url_list":["https://p9.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb1.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb3.pstatp.com/obj/330b000f63e3bf11a1f3"],"uri":"330b000f63e3bf11a1f3"},"share_info":{"share_weibo_desc":"#在抖音，分享美好生活#又被老爸训了，考驾照很难的，OK？不知你们是否读懂这里面蕴含的深意。@抖音小助手","share_title":"又被老爸训了，考驾照很难的，OK？不知你们是否读懂这里面蕴含的深意。@抖音小助手","share_url":"https://www.douyin.com/share/video/6525314426692701444/?region=CN&mid=6525314471035374343&titleType=title","share_desc":"在抖音，分享美好生活"},"is_top":0,"aweme_type":0,"desc":"又被老爸训了，考驾照很难的，OK？不知你们是否读懂这里面蕴含的深意。@抖音小助手","region":"","text_extra":[{"start":34,"user_id":"6796248446","end":40,"type":0}],"user_digged":0},{"label_top":{"url_list":["https://p3.pstatp.com/obj/c150000f34767e2cb56","https://pb9.pstatp.com/obj/c150000f34767e2cb56","https://pb3.pstatp.com/obj/c150000f34767e2cb56"],"uri":"c150000f34767e2cb56"},"author_user_id":79576651335,"rate":12,"create_time":1519291776,"video":{"ratio":"720p","has_watermark":true,"play_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=ec25f1fe82d2439790da6b3e7d2013e7&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=ec25f1fe82d2439790da6b3e7d2013e7&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"ec25f1fe82d2439790da6b3e7d2013e7"},"cover":{"url_list":["https://p3.pstatp.com/aweme/300x400/67da0011bb675493d6ce.jpeg","https://pb9.pstatp.com/aweme/300x400/67da0011bb675493d6ce.jpeg","https://pb3.pstatp.com/aweme/300x400/67da0011bb675493d6ce.jpeg"],"uri":"300x400/67da0011bb675493d6ce"},"height":960,"width":540,"download_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=ec25f1fe82d2439790da6b3e7d2013e7&line=0&ratio=720p&watermark=1&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=ec25f1fe82d2439790da6b3e7d2013e7&line=1&ratio=720p&watermark=1&media_type=4&vr_type=0"],"uri":"ec25f1fe82d2439790da6b3e7d2013e7"},"origin_cover":{"url_list":["http://p1.pstatp.com/large/67da0011bc60236c19b2.jpeg","http://pb3.pstatp.com/large/67da0011bc60236c19b2.jpeg","http://pb3.pstatp.com/large/67da0011bc60236c19b2.jpeg"],"uri":"large/67da0011bc60236c19b2"},"play_addr_lowbr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=ec25f1fe82d2439790da6b3e7d2013e7&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=ec25f1fe82d2439790da6b3e7d2013e7&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"ec25f1fe82d2439790da6b3e7d2013e7"},"dynamic_cover":{"url_list":["https://p1.pstatp.com/obj/67e000041a2d826adcc4","https://pb3.pstatp.com/obj/67e000041a2d826adcc4","https://pb3.pstatp.com/obj/67e000041a2d826adcc4"],"uri":"67e000041a2d826adcc4"}},"aweme_id":"6525308352782667022","video_labels":[],"is_vr":false,"vr_type":1,"statistics":{"play_count":125090,"aweme_id":"6525308352782667022","comment_count":340,"share_count":55,"digg_count":4106},"cmt_swt":false,"share_url":"https://www.douyin.com/share/video/6525308352782667022/?mid=6519884413235366669","is_ads":false,"bodydance_score":0,"is_hash_tag":0,"status":{"allow_share":true,"allow_comment":true,"with_goods":false,"is_private":false,"is_delete":false},"label_large":{"url_list":["https://p9.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb1.pstatp.com/obj/330b000f63e3bf11a1f3","https://pb3.pstatp.com/obj/330b000f63e3bf11a1f3"],"uri":"330b000f63e3bf11a1f3"},"share_info":{"share_weibo_desc":"#在抖音，分享美好生活#谁还不会卖萌了 你们还想看谁拍这个","share_title":"谁还不会卖萌了 你们还想看谁拍这个","share_url":"https://www.douyin.com/share/video/6525308352782667022/?region=CN&mid=6519884413235366669&titleType=title","share_desc":"在抖音，分享美好生活"},"is_top":0,"aweme_type":0,"desc":"谁还不会卖萌了 你们还想看谁拍这个","region":"","text_extra":[],"user_digged":0},{"label_top":{"url_list":["https://p3.pstatp.com/obj/c150000f34767e2cb56","https://pb9.pstatp.com/obj/c150000f34767e2cb56","https://pb3.pstatp.com/obj/c150000f34767e2cb56"],"uri":"c150000f34767e2cb56"},"author_user_id":66223166151,"rate":10,"create_time":1519290772,"video":{"ratio":"720p","has_watermark":true,"play_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=7667025b1eea407b845a97550605387f&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=7667025b1eea407b845a97550605387f&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"7667025b1eea407b845a97550605387f"},"cover":{"url_list":["https://p3.pstatp.com/aweme/300x400/67da000e9ec94891d50f.jpeg","https://pb9.pstatp.com/aweme/300x400/67da000e9ec94891d50f.jpeg","https://pb3.pstatp.com/aweme/300x400/67da000e9ec94891d50f.jpeg"],"uri":"300x400/67da000e9ec94891d50f"},"height":788,"width":458,"download_addr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=7667025b1eea407b845a97550605387f&line=0&ratio=720p&watermark=1&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=7667025b1eea407b845a97550605387f&line=1&ratio=720p&watermark=1&media_type=4&vr_type=0"],"uri":"7667025b1eea407b845a97550605387f"},"origin_cover":{"url_list":["http://p3.pstatp.com/large/67dc0004c28fa36146b2.jpeg","http://pb9.pstatp.com/large/67dc0004c28fa36146b2.jpeg","http://pb3.pstatp.com/large/67dc0004c28fa36146b2.jpeg"],"uri":"large/67dc0004c28fa36146b2"},"play_addr_lowbr":{"url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=7667025b1eea407b845a97550605387f&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=7667025b1eea407b845a97550605387f&line=1&ratio=720p&media_type=4&vr_type=0"],"uri":"7667025b1eea407b845a97550605387f"},"dynamic_cover":{"url_list":["https://p1.pstatp.com/obj/67db000dca39319e607b","https://pb3.pstatp.com/obj/67db000dca39319e607b","https://pb3.pstatp.com/obj/67db000dca39319e607b"],"uri":"67db000dca39319e607b"}},"aweme_id":"6525304075246898445","video_labels":[],"is_vr":false,"vr_type":1,"statistics":{"play_count":168500,"aweme_id":"6525304075246898445","comment_count":558,"share_count":1532,"digg_count":3653},"cmt_swt":false,"share_url":"https://www.douyin.com/share/video/6525304075246898445/?mid=6470023977330248462","is_ads":false,"bodydance_score":0,"is_hash_tag":0,"status":{"allow_share":true,"allow_comment":true,"with_goods":false,"is_private":false,"is_delete":false},"share_info":{"share_weibo_desc":"#在抖音，分享美好生活#肌肉确实不好练～б😌∂","share_title":"肌肉确实不好练～б😌∂","share_url":"https://www.douyin.com/share/video/6525304075246898445/?region=CN&mid=6470023977330248462&titleType=title","share_desc":"在抖音，分享美好生活"},"is_top":0,"aweme_type":0,"desc":"肌肉确实不好练～б😌∂","region":"","text_extra":[],"user_digged":0}]
         * desc : 热门挑战
         */

        private ChallengeInfoBean challenge_info;
        private String desc;
        private List<AwemeListBean> aweme_list;

        public ChallengeInfoBean getChallenge_info() {
            return challenge_info;
        }

        public void setChallenge_info(ChallengeInfoBean challenge_info) {
            this.challenge_info = challenge_info;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public List<AwemeListBean> getAweme_list() {
            return aweme_list;
        }

        public void setAweme_list(List<AwemeListBean> aweme_list) {
            this.aweme_list = aweme_list;
        }

        public static class ChallengeInfoBean {
            /**
             * schema : aweme://aweme/challenge/detail?cid=1592990718990343
             * user_count : 5541
             * author : {}
             * cha_name : 站好，喷泉表演开始了！
             * cid : 1592990718990343
             * type : 0
             * desc : “你把指尖聚拢，手举起来，高一点，再高一点，哎对，你给自己放了一支烟花！”豆芽们是不是对这个最“环保”的放烟花招数非常熟悉了呢？抖音君这次推荐你一个更好玩的方法——组团来玩喷泉表演！
             和你的小伙伴们站成一排，每人充当一个“水柱”跟着音乐的节奏，蹲下站起，表演出喷泉的波动感！这对你们之间的默契度是个大考验哦，还不快来挑战一下！抖音君给大家准备了4首推荐音乐，快来试试吧！
             */

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

        public static class AwemeListBean {


            private LabelTopBean label_top;
            private long author_user_id;
            private int rate;
            private int create_time;
            private VideoBean video;
            private String aweme_id;
            private boolean is_vr;
            private int vr_type;
            private StatisticsBean statistics;
            private boolean cmt_swt;
            private String share_url;
            private boolean is_ads;
            private int bodydance_score;
            private int is_hash_tag;
            private StatusBean status;
            private LabelLargeBean label_large;
            private ShareInfoBean share_info;
            private int is_top;
            private int aweme_type;
            private String desc;
            private String region;
            private int user_digged;
            private List<?> video_labels;
            private List<?> text_extra;

            public LabelTopBean getLabel_top() {
                return label_top;
            }

            public void setLabel_top(LabelTopBean label_top) {
                this.label_top = label_top;
            }

            public long getAuthor_user_id() {
                return author_user_id;
            }

            public void setAuthor_user_id(long author_user_id) {
                this.author_user_id = author_user_id;
            }

            public int getRate() {
                return rate;
            }

            public void setRate(int rate) {
                this.rate = rate;
            }

            public int getCreate_time() {
                return create_time;
            }

            public void setCreate_time(int create_time) {
                this.create_time = create_time;
            }

            public VideoBean getVideo() {
                return video;
            }

            public void setVideo(VideoBean video) {
                this.video = video;
            }

            public String getAweme_id() {
                return aweme_id;
            }

            public void setAweme_id(String aweme_id) {
                this.aweme_id = aweme_id;
            }

            public boolean isIs_vr() {
                return is_vr;
            }

            public void setIs_vr(boolean is_vr) {
                this.is_vr = is_vr;
            }

            public int getVr_type() {
                return vr_type;
            }

            public void setVr_type(int vr_type) {
                this.vr_type = vr_type;
            }

            public StatisticsBean getStatistics() {
                return statistics;
            }

            public void setStatistics(StatisticsBean statistics) {
                this.statistics = statistics;
            }

            public boolean isCmt_swt() {
                return cmt_swt;
            }

            public void setCmt_swt(boolean cmt_swt) {
                this.cmt_swt = cmt_swt;
            }

            public String getShare_url() {
                return share_url;
            }

            public void setShare_url(String share_url) {
                this.share_url = share_url;
            }

            public boolean isIs_ads() {
                return is_ads;
            }

            public void setIs_ads(boolean is_ads) {
                this.is_ads = is_ads;
            }

            public int getBodydance_score() {
                return bodydance_score;
            }

            public void setBodydance_score(int bodydance_score) {
                this.bodydance_score = bodydance_score;
            }

            public int getIs_hash_tag() {
                return is_hash_tag;
            }

            public void setIs_hash_tag(int is_hash_tag) {
                this.is_hash_tag = is_hash_tag;
            }

            public StatusBean getStatus() {
                return status;
            }

            public void setStatus(StatusBean status) {
                this.status = status;
            }

            public LabelLargeBean getLabel_large() {
                return label_large;
            }

            public void setLabel_large(LabelLargeBean label_large) {
                this.label_large = label_large;
            }

            public ShareInfoBean getShare_info() {
                return share_info;
            }

            public void setShare_info(ShareInfoBean share_info) {
                this.share_info = share_info;
            }

            public int getIs_top() {
                return is_top;
            }

            public void setIs_top(int is_top) {
                this.is_top = is_top;
            }

            public int getAweme_type() {
                return aweme_type;
            }

            public void setAweme_type(int aweme_type) {
                this.aweme_type = aweme_type;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getRegion() {
                return region;
            }

            public void setRegion(String region) {
                this.region = region;
            }

            public int getUser_digged() {
                return user_digged;
            }

            public void setUser_digged(int user_digged) {
                this.user_digged = user_digged;
            }

            public List<?> getVideo_labels() {
                return video_labels;
            }

            public void setVideo_labels(List<?> video_labels) {
                this.video_labels = video_labels;
            }

            public List<?> getText_extra() {
                return text_extra;
            }

            public void setText_extra(List<?> text_extra) {
                this.text_extra = text_extra;
            }

            public static class LabelTopBean {

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class VideoBean {


                private String ratio;
                private boolean has_watermark;
                private PlayAddrBean play_addr;
                private CoverBean cover;
                private int height;
                private int width;
                private DownloadAddrBean download_addr;
                private OriginCoverBean origin_cover;
                private PlayAddrLowbrBean play_addr_lowbr;
                private DynamicCoverBean dynamic_cover;

                public String getRatio() {
                    return ratio;
                }

                public void setRatio(String ratio) {
                    this.ratio = ratio;
                }

                public boolean isHas_watermark() {
                    return has_watermark;
                }

                public void setHas_watermark(boolean has_watermark) {
                    this.has_watermark = has_watermark;
                }

                public PlayAddrBean getPlay_addr() {
                    return play_addr;
                }

                public void setPlay_addr(PlayAddrBean play_addr) {
                    this.play_addr = play_addr;
                }

                public CoverBean getCover() {
                    return cover;
                }

                public void setCover(CoverBean cover) {
                    this.cover = cover;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public DownloadAddrBean getDownload_addr() {
                    return download_addr;
                }

                public void setDownload_addr(DownloadAddrBean download_addr) {
                    this.download_addr = download_addr;
                }

                public OriginCoverBean getOrigin_cover() {
                    return origin_cover;
                }

                public void setOrigin_cover(OriginCoverBean origin_cover) {
                    this.origin_cover = origin_cover;
                }

                public PlayAddrLowbrBean getPlay_addr_lowbr() {
                    return play_addr_lowbr;
                }

                public void setPlay_addr_lowbr(PlayAddrLowbrBean play_addr_lowbr) {
                    this.play_addr_lowbr = play_addr_lowbr;
                }

                public DynamicCoverBean getDynamic_cover() {
                    return dynamic_cover;
                }

                public void setDynamic_cover(DynamicCoverBean dynamic_cover) {
                    this.dynamic_cover = dynamic_cover;
                }

                public static class PlayAddrBean {
                    /**
                     * url_list : ["https://aweme.snssdk.com/aweme/v1/play/?video_id=e878ff97707f410a8160d23e181502ee&line=0&ratio=720p&media_type=4&vr_type=0","https://aweme.snssdk.com/aweme/v1/play/?video_id=e878ff97707f410a8160d23e181502ee&line=1&ratio=720p&media_type=4&vr_type=0"]
                     * uri : e878ff97707f410a8160d23e181502ee
                     */

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class CoverBean {
                    /**
                     * url_list : ["https://p3.pstatp.com/aweme/300x400/679e000fa3fd364bd196.jpeg","https://pb9.pstatp.com/aweme/300x400/679e000fa3fd364bd196.jpeg","https://pb3.pstatp.com/aweme/300x400/679e000fa3fd364bd196.jpeg"]
                     * uri : 300x400/679e000fa3fd364bd196
                     */

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class DownloadAddrBean {

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class OriginCoverBean {


                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class PlayAddrLowbrBean {


                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class DynamicCoverBean {


                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }
            }

            public static class StatisticsBean {


                private int play_count;
                private String aweme_id;
                private int comment_count;
                private int share_count;
                private int digg_count;

                public int getPlay_count() {
                    return play_count;
                }

                public void setPlay_count(int play_count) {
                    this.play_count = play_count;
                }

                public String getAweme_id() {
                    return aweme_id;
                }

                public void setAweme_id(String aweme_id) {
                    this.aweme_id = aweme_id;
                }

                public int getComment_count() {
                    return comment_count;
                }

                public void setComment_count(int comment_count) {
                    this.comment_count = comment_count;
                }

                public int getShare_count() {
                    return share_count;
                }

                public void setShare_count(int share_count) {
                    this.share_count = share_count;
                }

                public int getDigg_count() {
                    return digg_count;
                }

                public void setDigg_count(int digg_count) {
                    this.digg_count = digg_count;
                }
            }

            public static class StatusBean {


                private boolean allow_share;
                private boolean allow_comment;
                private boolean with_goods;
                private boolean is_private;
                private boolean is_delete;

                public boolean isAllow_share() {
                    return allow_share;
                }

                public void setAllow_share(boolean allow_share) {
                    this.allow_share = allow_share;
                }

                public boolean isAllow_comment() {
                    return allow_comment;
                }

                public void setAllow_comment(boolean allow_comment) {
                    this.allow_comment = allow_comment;
                }

                public boolean isWith_goods() {
                    return with_goods;
                }

                public void setWith_goods(boolean with_goods) {
                    this.with_goods = with_goods;
                }

                public boolean isIs_private() {
                    return is_private;
                }

                public void setIs_private(boolean is_private) {
                    this.is_private = is_private;
                }

                public boolean isIs_delete() {
                    return is_delete;
                }

                public void setIs_delete(boolean is_delete) {
                    this.is_delete = is_delete;
                }
            }

            public static class LabelLargeBean {


                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class ShareInfoBean {


                private String share_weibo_desc;
                private String share_title;
                private String share_url;
                private String share_desc;

                public String getShare_weibo_desc() {
                    return share_weibo_desc;
                }

                public void setShare_weibo_desc(String share_weibo_desc) {
                    this.share_weibo_desc = share_weibo_desc;
                }

                public String getShare_title() {
                    return share_title;
                }

                public void setShare_title(String share_title) {
                    this.share_title = share_title;
                }

                public String getShare_url() {
                    return share_url;
                }

                public void setShare_url(String share_url) {
                    this.share_url = share_url;
                }

                public String getShare_desc() {
                    return share_desc;
                }

                public void setShare_desc(String share_desc) {
                    this.share_desc = share_desc;
                }
            }
        }
    }
}
