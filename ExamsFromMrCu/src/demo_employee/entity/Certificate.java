package demo_employee.entity;

import java.time.LocalDate;

public class Certificate {
    private String certificatedId;
    private String certificateName;
    private String certificateRank;
    private LocalDate certificatedDate;

    public Certificate(){

    }

    public Certificate(String certificatedId, String certificateName, String certificateRank, LocalDate certificatedDate) {
        this.certificatedId = certificatedId;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
    }

    public String getCertificatedId() {
        return certificatedId;
    }

    public void setCertificatedId(String certificatedId) {
        this.certificatedId = certificatedId;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public LocalDate getCertificatedDate() {
        return certificatedDate;
    }

    public void setCertificatedDate(LocalDate certificatedDate) {
        this.certificatedDate = certificatedDate;
    }
}
