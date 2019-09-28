package model;

import java.math.BigDecimal;
import java.util.Date;

public class co_inv_his_apply {
    private Long id;

    private String applyId;

    private String imsInvoiceOrderId;

    private String imsApplyId;

    private String uin;

    private String bizTypeId;

    private Integer status;

    private Long mdmId;

    private Integer invoiceMode;

    private BigDecimal applyAmount;

    private Date applyDate;

    private Date invalidDate;

    private String applyErrMsg;

    private String invoiceTitle;

    private Integer invoiceType;

    private Integer purchaserIdType;

    private String purchaserId;

    private String purchaserBankName;

    private String purchaserBankAcctNum;

    private String purchaserAddress;

    private String purchaserPhone;

    private String province;

    private String city;

    private String address;

    private String postCode;

    private String contactName;

    private String contactPhone;

    private String expressCompany;

    private String expressNo;

    private Date mailingDate;

    private Date refundApplyDate;

    private String refundReason;

    private String refundRemark;

    private String refundExpressCompany;

    private String refundExpressNo;

    private Integer refundDeductFlag;

    private Integer refundApplyStatus;

    private String refundErrMsg;

    private Integer handleStatus;

    private Date createDate;

    private Date updateDate;

    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    public String getImsInvoiceOrderId() {
        return imsInvoiceOrderId;
    }

    public void setImsInvoiceOrderId(String imsInvoiceOrderId) {
        this.imsInvoiceOrderId = imsInvoiceOrderId == null ? null : imsInvoiceOrderId.trim();
    }

    public String getImsApplyId() {
        return imsApplyId;
    }

    public void setImsApplyId(String imsApplyId) {
        this.imsApplyId = imsApplyId == null ? null : imsApplyId.trim();
    }

    public String getUin() {
        return uin;
    }

    public void setUin(String uin) {
        this.uin = uin == null ? null : uin.trim();
    }

    public String getBizTypeId() {
        return bizTypeId;
    }

    public void setBizTypeId(String bizTypeId) {
        this.bizTypeId = bizTypeId == null ? null : bizTypeId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getMdmId() {
        return mdmId;
    }

    public void setMdmId(Long mdmId) {
        this.mdmId = mdmId;
    }

    public Integer getInvoiceMode() {
        return invoiceMode;
    }

    public void setInvoiceMode(Integer invoiceMode) {
        this.invoiceMode = invoiceMode;
    }

    public BigDecimal getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getApplyErrMsg() {
        return applyErrMsg;
    }

    public void setApplyErrMsg(String applyErrMsg) {
        this.applyErrMsg = applyErrMsg == null ? null : applyErrMsg.trim();
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getPurchaserIdType() {
        return purchaserIdType;
    }

    public void setPurchaserIdType(Integer purchaserIdType) {
        this.purchaserIdType = purchaserIdType;
    }

    public String getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId == null ? null : purchaserId.trim();
    }

    public String getPurchaserBankName() {
        return purchaserBankName;
    }

    public void setPurchaserBankName(String purchaserBankName) {
        this.purchaserBankName = purchaserBankName == null ? null : purchaserBankName.trim();
    }

    public String getPurchaserBankAcctNum() {
        return purchaserBankAcctNum;
    }

    public void setPurchaserBankAcctNum(String purchaserBankAcctNum) {
        this.purchaserBankAcctNum = purchaserBankAcctNum == null ? null : purchaserBankAcctNum.trim();
    }

    public String getPurchaserAddress() {
        return purchaserAddress;
    }

    public void setPurchaserAddress(String purchaserAddress) {
        this.purchaserAddress = purchaserAddress == null ? null : purchaserAddress.trim();
    }

    public String getPurchaserPhone() {
        return purchaserPhone;
    }

    public void setPurchaserPhone(String purchaserPhone) {
        this.purchaserPhone = purchaserPhone == null ? null : purchaserPhone.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany == null ? null : expressCompany.trim();
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo == null ? null : expressNo.trim();
    }

    public Date getMailingDate() {
        return mailingDate;
    }

    public void setMailingDate(Date mailingDate) {
        this.mailingDate = mailingDate;
    }

    public Date getRefundApplyDate() {
        return refundApplyDate;
    }

    public void setRefundApplyDate(Date refundApplyDate) {
        this.refundApplyDate = refundApplyDate;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    public String getRefundRemark() {
        return refundRemark;
    }

    public void setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark == null ? null : refundRemark.trim();
    }

    public String getRefundExpressCompany() {
        return refundExpressCompany;
    }

    public void setRefundExpressCompany(String refundExpressCompany) {
        this.refundExpressCompany = refundExpressCompany == null ? null : refundExpressCompany.trim();
    }

    public String getRefundExpressNo() {
        return refundExpressNo;
    }

    public void setRefundExpressNo(String refundExpressNo) {
        this.refundExpressNo = refundExpressNo == null ? null : refundExpressNo.trim();
    }

    public Integer getRefundDeductFlag() {
        return refundDeductFlag;
    }

    public void setRefundDeductFlag(Integer refundDeductFlag) {
        this.refundDeductFlag = refundDeductFlag;
    }

    public Integer getRefundApplyStatus() {
        return refundApplyStatus;
    }

    public void setRefundApplyStatus(Integer refundApplyStatus) {
        this.refundApplyStatus = refundApplyStatus;
    }

    public String getRefundErrMsg() {
        return refundErrMsg;
    }

    public void setRefundErrMsg(String refundErrMsg) {
        this.refundErrMsg = refundErrMsg == null ? null : refundErrMsg.trim();
    }

    public Integer getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}