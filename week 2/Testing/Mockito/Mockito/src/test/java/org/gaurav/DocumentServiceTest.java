package org.gaurav;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class DocumentServiceTest {
    @Test
    void testPrintCalled() {

        Printer mockPrinter = mock(Printer.class);

        DocumentService service = new DocumentService(mockPrinter);

        service.printDocument("Hello");


        verify(mockPrinter).print("Hello");
    }
}
