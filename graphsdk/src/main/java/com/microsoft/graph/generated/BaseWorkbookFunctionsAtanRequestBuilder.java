// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Atan Request Builder.
 */
public class BaseWorkbookFunctionsAtanRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAtan
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsAtanRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement number) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("number", number);
    }

    /**
     * Creates the IWorkbookFunctionsAtanRequest
     *
     * @return The IWorkbookFunctionsAtanRequest instance
     */
    public IWorkbookFunctionsAtanRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAtanRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsAtanRequest instance
     */
    public IWorkbookFunctionsAtanRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsAtanRequest request = new WorkbookFunctionsAtanRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.mBody.number = getParameter("number");
        }

        return request;
    }
}
