package file.domain;

import file.base.IDomainBase;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

/**
 * Created by ZhangY05 on 2017/7/11.
 */
@Entity
@Table(name="Par_UploadFile")
public class PartyUploadFile implements IDomainBase {

    @Id
    @Column(name="relationId", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long relationId;

    @Column(name="partyId", unique=true, nullable=false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long partyId;

    @ManyToOne(targetEntity=UploadFileInfo.class, fetch=FetchType.EAGER)
    @JoinColumn(name="uploadId", nullable=false)
    private UploadFileInfo uploadFile;

    @Override
    @Transactional
    public Object getObjectId() {
        return this.relationId;
    }

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public UploadFileInfo getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(UploadFileInfo uploadFile) {
        this.uploadFile = uploadFile;
    }
}
