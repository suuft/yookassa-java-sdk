package net.suuft.yookassa.model.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import net.suuft.yookassa.model.Amount;

import java.util.UUID;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class RefundRequest {

    Amount amount;
    UUID payment_id;
}