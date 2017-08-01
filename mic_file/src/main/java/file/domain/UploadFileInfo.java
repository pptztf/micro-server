package file.domain;

import file.base.IDomainBase;

import javax.persistence.*;

/**
 * Created by ZhangY05 on 2017/7/11.
 */
@Entity
@Table(name="UploadFile_Info")
public class UploadFileInfo implements IDomainBase {

    @Id
    @Column(name="uploadId", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long uploadId;

    private Integer type;
    private String uploadName;
    private String note;
    private String saveDir;
    private String saveName;
    private String picName;
    private String picType;

    public Long getUploadId() {
        return uploadId;
    }

    public void setUploadId(Long uploadId) {
        this.uploadId = uploadId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUploadName() {
        return uploadName;
    }

    public void setUploadName(String uploadName) {
        this.uploadName = uploadName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSaveDir() {
        return saveDir;
    }

    public void setSaveDir(String saveDir) {
        this.saveDir = saveDir;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getPicType() {
        return picType;
    }

    public void setPicType(String picType) {
        this.picType = picType;
    }

    @Override
    public Object getObjectId() {
        return this.uploadId;
    }
}
