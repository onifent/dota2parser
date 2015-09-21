package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetMatchHistory {

    private MatchesResult result;

    public MatchesResult getResult() {
        return result;
    }
}