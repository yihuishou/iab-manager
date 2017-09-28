package loclhost.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by BlueSky on 2017/9/13.
 */
@Entity
public class Portfolio {
    //本ID
    @Id
    @GeneratedValue
    private Integer portfolioID;
    //本名
    private String bookName;
    //创建时间
    private LocalDate createBookDate;
    //完成时间
    private LocalDate finishBookDate;
    //最后修改时间
    private LocalDateTime lastReviseTime;
    //本源路径
    private String originalBookPath;
    //PSD文件路径
    private String workPsdPath;
    //成品路径
    private String finishedBookPath;
    //图源名
    private String BookSourceOwnerName;
    //翻译名
    private String BookTranslatedName;
    // 校对名
    private String BookCheckerName;
    //作者
    private String authorName;

    public Integer getPortfolioID() {
        return portfolioID;
    }

    public void setPortfolioID(Integer portfolioID) {
        this.portfolioID = portfolioID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public LocalDate getCreateBookDate() {
        return createBookDate;
    }

    public void setCreateBookDate(LocalDate createBookDate) {
        this.createBookDate = createBookDate;
    }

    public LocalDate getFinishBookDate() {
        return finishBookDate;
    }

    public void setFinishBookDate(LocalDate finishBookDate) {
        this.finishBookDate = finishBookDate;
    }

    public LocalDateTime getLastReviseTime() {
        return lastReviseTime;
    }

    public void setLastReviseTime(LocalDateTime lastReviseTime) {
        this.lastReviseTime = lastReviseTime;
    }

    public String getOriginalBookPath() {
        return originalBookPath;
    }

    public void setOriginalBookPath(String originalBookPath) {
        this.originalBookPath = originalBookPath;
    }

    public String getWorkPsdPath() {
        return workPsdPath;
    }

    public void setWorkPsdPath(String workPsdPath) {
        this.workPsdPath = workPsdPath;
    }

    public String getFinishedBookPath() {
        return finishedBookPath;
    }

    public void setFinishedBookPath(String finishedBookPath) {
        this.finishedBookPath = finishedBookPath;
    }

    public String getBookSourceOwnerName() {
        return BookSourceOwnerName;
    }

    public void setBookSourceOwnerName(String bookSourceOwnerName) {
        BookSourceOwnerName = bookSourceOwnerName;
    }

    public String getBookTranslatedName() {
        return BookTranslatedName;
    }

    public void setBookTranslatedName(String bookTranslatedName) {
        BookTranslatedName = bookTranslatedName;
    }

    public String getBookCheckerName() {
        return BookCheckerName;
    }

    public void setBookCheckerName(String bookCheckerName) {
        BookCheckerName = bookCheckerName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
