package employee;

import java.time.LocalDate;

public class Certificate {
    private int certificatedID;
    private String certificateName;
    private  String certificateRank;
    private LocalDate certificatedDate;

    public Certificate(int certificatedID, String certificateName, String certificateRank, LocalDate certificatedDate) {
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
    }

    public int getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(int certificatedID) {
        this.certificatedID = certificatedID;
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
