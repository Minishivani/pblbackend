
package com.springboot.pbl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document("blog")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    @Transient
    public static String SEQUENCE_NAME = "blog_sequence";
    @Id
    private Long id;
    public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	public static void setSequenceName(String sequenceName) {
		SEQUENCE_NAME = sequenceName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getShortIntro() {
		return shortIntro;
	}
	public void setShortIntro(String shortIntro) {
		this.shortIntro = shortIntro;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCrtdBy() {
		return crtdBy;
	}
	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}
	public Date getCrtdTme() {
		return crtdTme;
	}
	public void setCrtdTme(Date crtdTme) {
		this.crtdTme = crtdTme;
	}
	public Boolean getApproved() {
		return approved;
	}
	public void setApproved(Boolean approved) {
		this.approved = approved;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public Date getApprvdTme() {
		return apprvdTme;
	}
	public void setApprvdTme(Date apprvdTme) {
		this.apprvdTme = apprvdTme;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getVisibility() {
		return visibility;
	}
	public void setVisibility(Boolean visibility) {
		this.visibility = visibility;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public Map<String, String> getComments() {
		return comments;
	}
	public void setComments(Map<String, String> comments) {
		this.comments = comments;
	}
	public List<String> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<String> attachments) {
		this.attachments = attachments;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Set<String> getLikes() {
		return likes;
	}
	public void setLikes(Set<String> likes) {
		this.likes = likes;
	}
	public Set<String> getUnlikes() {
		return unlikes;
	}
	public void setUnlikes(Set<String> unlikes) {
		this.unlikes = unlikes;
	}
	public Map<String, Boolean> getProjectRequests() {
		return projectRequests;
	}
	public void setProjectRequests(Map<String, Boolean> projectRequests) {
		this.projectRequests = projectRequests;
	}
	private String sub;
    private String shortIntro;
    private String desc;
    private String crtdBy;
    private Date crtdTme;
    private Boolean approved;
    private String approvedBy;
    private Date apprvdTme;
    private String status;
    private Boolean visibility; // public true // private false
    List<String> categories = new ArrayList<>();
    private Map<String,String> comments = new HashMap<>();
    private List<String> attachments = new ArrayList<>();
    private Date startDate;
    private Date endDate;
    private Set<String> likes =  new HashSet<>();
    private Set<String> unlikes = new HashSet<>();
    private Map<String,Boolean> projectRequests = new HashMap<>();
}
