package model;

import java.time.LocalDateTime;

// roudha SHARED STARTER: this is an INTERFACE.
// Job implements it; Scheduler checks permissions and settles the balance.
public interface Cancellable {
    void cancel(String cancelledBy, String reason, LocalDateTime cancelledAt);
}
