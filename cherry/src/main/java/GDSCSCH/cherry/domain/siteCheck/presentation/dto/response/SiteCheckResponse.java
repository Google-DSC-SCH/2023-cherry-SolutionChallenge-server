package GDSCSCH.cherry.domain.siteCheck.presentation.dto.response;

import GDSCSCH.cherry.domain.siteCheck.domain.vo.SiteCheckInfoVo;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SiteCheckResponse {

    private final Long siteId;
    private final String siteQuestion;
    private final boolean siteAnswer;

    public SiteCheckResponse(SiteCheckInfoVo siteCheckInfoVo) {
        this.siteId  = siteCheckInfoVo.getCheckId();
        this.siteQuestion = siteCheckInfoVo.getSiteQuestion();
        this.siteAnswer = siteCheckInfoVo.isSiteAnswer();
    }
}
