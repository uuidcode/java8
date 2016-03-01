package com.kakao.prmc.java8.entity;

import com.kakao.prmc.core.entity.CoreEntity;

import java.util.Date;

public class Project extends CoreEntity<Project> {
    private Long projectId;
    private String name;
    private String title;
    private String seqName;
    private String projectType;
    private String imageUrl;
    private String listImageUrl;
    private String movieImageUrl;
    private String vid;
    private String clipId;
    private String summary;
    private String comment;
    private String supportMovieImageUrl;
    private String supportVid;
    private String supportClipId;
    private Date supportFromDatetime;
    private Date supportToDatetime;
    private Long supportTargetAmount;
    private Long supportCurrentAmount;
    private Long supportCurrentCount;
    private String supportStatus;
    private Date regDatetime;
    private Date modDatetime;
    private Long regMemberId;
    private Long modMemberId;
    private String cp;
    private String companyName;
    private String bizType;
    private Long promotionAmount;
    private String promotionImageUrl;
    private String promotionImageBackgroundColor;
    private Long sponsorAmount;
    private String sponsorImageUrl;
    private String sponsorName;
    private String description;
    private String answer1;
    private String answer2;
    private String answer3;
    private String mainDisplay;
    private Long createMemberId;
    private String privacyAgree;
    private Date submitDatetime;
    private Long totalSponsorAmount;
    private Long totalCouponAmount;
    private Long totalSponsorCount;
    private Long totalCouponCount;
    private Date confirmDatetime;
    private String ready;
    private Date successDatetime;

    public Long getProjectId() {
        return this.projectId;
    }

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSeqName() {
        return this.seqName;
    }

    public String getProjectType() {
        return this.projectType;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getListImageUrl() {
        return this.listImageUrl;
    }

    public String getMovieImageUrl() {
        return this.movieImageUrl;
    }

    public String getVid() {
        return this.vid;
    }

    public String getClipId() {
        return this.clipId;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getComment() {
        return this.comment;
    }

    public String getSupportMovieImageUrl() {
        return this.supportMovieImageUrl;
    }

    public String getSupportVid() {
        return this.supportVid;
    }

    public String getSupportClipId() {
        return this.supportClipId;
    }

    public Date getSupportFromDatetime() {
        return this.supportFromDatetime;
    }

    public Date getSupportToDatetime() {
        return this.supportToDatetime;
    }

    public Long getSupportTargetAmount() {
        return this.supportTargetAmount;
    }

    public Long getSupportCurrentAmount() {
        return this.supportCurrentAmount;
    }

    public Long getSupportCurrentCount() {
        return this.supportCurrentCount;
    }

    public String getSupportStatus() {
        return this.supportStatus;
    }

    public Date getRegDatetime() {
        return this.regDatetime;
    }

    public Date getModDatetime() {
        return this.modDatetime;
    }

    public Long getRegMemberId() {
        return this.regMemberId;
    }

    public Long getModMemberId() {
        return this.modMemberId;
    }

    public String getCp() {
        return this.cp;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String getBizType() {
        return this.bizType;
    }

    public Long getPromotionAmount() {
        return this.promotionAmount;
    }

    public String getPromotionImageUrl() {
        return this.promotionImageUrl;
    }

    public String getPromotionImageBackgroundColor() {
        return this.promotionImageBackgroundColor;
    }

    public Long getSponsorAmount() {
        return this.sponsorAmount;
    }

    public String getSponsorImageUrl() {
        return this.sponsorImageUrl;
    }

    public String getSponsorName() {
        return this.sponsorName;
    }

    public String getDescription() {
        return this.description;
    }

    public String getAnswer1() {
        return this.answer1;
    }

    public String getAnswer2() {
        return this.answer2;
    }

    public String getAnswer3() {
        return this.answer3;
    }

    public String getMainDisplay() {
        return this.mainDisplay;
    }

    public Long getCreateMemberId() {
        return this.createMemberId;
    }

    public String getPrivacyAgree() {
        return this.privacyAgree;
    }

    public Date getSubmitDatetime() {
        return this.submitDatetime;
    }

    public Long getTotalSponsorAmount() {
        return this.totalSponsorAmount;
    }

    public Long getTotalCouponAmount() {
        return this.totalCouponAmount;
    }

    public Long getTotalSponsorCount() {
        return this.totalSponsorCount;
    }

    public Long getTotalCouponCount() {
        return this.totalCouponCount;
    }

    public Date getConfirmDatetime() {
        return this.confirmDatetime;
    }

    public String getReady() {
        return this.ready;
    }

    public Date getSuccessDatetime() {
        return this.successDatetime;
    }

    public Project setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Project setName(String name) {
        this.name = name;
        return this;
    }
    public Project setTitle(String title) {
        this.title = title;
        return this;
    }
    public Project setSeqName(String seqName) {
        this.seqName = seqName;
        return this;
    }
    public Project setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }
    public Project setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public Project setListImageUrl(String listImageUrl) {
        this.listImageUrl = listImageUrl;
        return this;
    }
    public Project setMovieImageUrl(String movieImageUrl) {
        this.movieImageUrl = movieImageUrl;
        return this;
    }
    public Project setVid(String vid) {
        this.vid = vid;
        return this;
    }
    public Project setClipId(String clipId) {
        this.clipId = clipId;
        return this;
    }
    public Project setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public Project setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public Project setSupportMovieImageUrl(String supportMovieImageUrl) {
        this.supportMovieImageUrl = supportMovieImageUrl;
        return this;
    }
    public Project setSupportVid(String supportVid) {
        this.supportVid = supportVid;
        return this;
    }
    public Project setSupportClipId(String supportClipId) {
        this.supportClipId = supportClipId;
        return this;
    }
    public Project setSupportFromDatetime(Date supportFromDatetime) {
        this.supportFromDatetime = supportFromDatetime;
        return this;
    }
    public Project setSupportToDatetime(Date supportToDatetime) {
        this.supportToDatetime = supportToDatetime;
        return this;
    }
    public Project setSupportTargetAmount(Long supportTargetAmount) {
        this.supportTargetAmount = supportTargetAmount;
        return this;
    }
    public Project setSupportCurrentAmount(Long supportCurrentAmount) {
        this.supportCurrentAmount = supportCurrentAmount;
        return this;
    }
    public Project setSupportCurrentCount(Long supportCurrentCount) {
        this.supportCurrentCount = supportCurrentCount;
        return this;
    }
    public Project setSupportStatus(String supportStatus) {
        this.supportStatus = supportStatus;
        return this;
    }
    public Project setRegDatetime(Date regDatetime) {
        this.regDatetime = regDatetime;
        return this;
    }
    public Project setModDatetime(Date modDatetime) {
        this.modDatetime = modDatetime;
        return this;
    }
    public Project setRegMemberId(Long regMemberId) {
        this.regMemberId = regMemberId;
        return this;
    }
    public Project setModMemberId(Long modMemberId) {
        this.modMemberId = modMemberId;
        return this;
    }
    public Project setCp(String cp) {
        this.cp = cp;
        return this;
    }
    public Project setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public Project setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public Project setPromotionAmount(Long promotionAmount) {
        this.promotionAmount = promotionAmount;
        return this;
    }
    public Project setPromotionImageUrl(String promotionImageUrl) {
        this.promotionImageUrl = promotionImageUrl;
        return this;
    }
    public Project setPromotionImageBackgroundColor(String promotionImageBackgroundColor) {
        this.promotionImageBackgroundColor = promotionImageBackgroundColor;
        return this;
    }
    public Project setSponsorAmount(Long sponsorAmount) {
        this.sponsorAmount = sponsorAmount;
        return this;
    }
    public Project setSponsorImageUrl(String sponsorImageUrl) {
        this.sponsorImageUrl = sponsorImageUrl;
        return this;
    }
    public Project setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
        return this;
    }
    public Project setDescription(String description) {
        this.description = description;
        return this;
    }
    public Project setAnswer1(String answer1) {
        this.answer1 = answer1;
        return this;
    }
    public Project setAnswer2(String answer2) {
        this.answer2 = answer2;
        return this;
    }
    public Project setAnswer3(String answer3) {
        this.answer3 = answer3;
        return this;
    }
    public Project setMainDisplay(String mainDisplay) {
        this.mainDisplay = mainDisplay;
        return this;
    }
    public Project setCreateMemberId(Long createMemberId) {
        this.createMemberId = createMemberId;
        return this;
    }
    public Project setPrivacyAgree(String privacyAgree) {
        this.privacyAgree = privacyAgree;
        return this;
    }
    public Project setSubmitDatetime(Date submitDatetime) {
        this.submitDatetime = submitDatetime;
        return this;
    }
    public Project setTotalSponsorAmount(Long totalSponsorAmount) {
        this.totalSponsorAmount = totalSponsorAmount;
        return this;
    }
    public Project setTotalCouponAmount(Long totalCouponAmount) {
        this.totalCouponAmount = totalCouponAmount;
        return this;
    }
    public Project setTotalSponsorCount(Long totalSponsorCount) {
        this.totalSponsorCount = totalSponsorCount;
        return this;
    }
    public Project setTotalCouponCount(Long totalCouponCount) {
        this.totalCouponCount = totalCouponCount;
        return this;
    }
    public Project setConfirmDatetime(Date confirmDatetime) {
        this.confirmDatetime = confirmDatetime;
        return this;
    }
    public Project setReady(String ready) {
        this.ready = ready;
        return this;
    }
    public Project setSuccessDatetime(Date successDatetime) {
        this.successDatetime = successDatetime;
        return this;
    }
}