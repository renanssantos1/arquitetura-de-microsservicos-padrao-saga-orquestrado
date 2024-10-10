package br.com.microservices.orchestrated.orderservice.core.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class EventFilters {

    @NotEmpty(message = "OrderId must be informed.")
    private String orderId;

    @NotEmpty(message = "TransactionId must be informed.")
    private String transactionId;
}
