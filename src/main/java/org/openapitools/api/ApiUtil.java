package org.openapitools.api;

import org.springframework.web.context.request.NativeWebRequest;
import org.apache.catalina.connector.ResponseFacade;
import java.io.IOException;

public class ApiUtil {
    public static void setExampleResponse(NativeWebRequest req, String contentType, String example) {
        try {
            ResponseFacade res2 = (ResponseFacade) req.getNativeResponse();

            //res2.setCharacterEncoding("UTF-8");
            res2.addHeader("Content-Type", contentType);
            res2.getWriter().print(example);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
