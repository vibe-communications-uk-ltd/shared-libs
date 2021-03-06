package uk.co.vibe.viva.shared.dto.recording;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordingDTO {
    private String id;
    private String pid;
    private String cid;
    private String from;
    private String to;
    private String customerId;
    private String customerName;
    private String name;
    private String bucket;
    private String retention;
    private String url;
    private Date created;
    private Date expires;
    private Date uploaded;
    private long ringDuration;
    private long callDuration;
    private HashSet<String> tags;
    private String ip;
    private String direction;
}
