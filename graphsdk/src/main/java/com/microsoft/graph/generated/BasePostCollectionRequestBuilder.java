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
 * The class for the Base Post Collection Request Builder.
 */
public class BasePostCollectionRequestBuilder extends BaseRequestBuilder implements IBasePostCollectionRequestBuilder {

    /**
     * The request builder for this collection of ConversationThread
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePostCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IPostCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IPostCollectionRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new PostCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPostRequestBuilder byId(final String id) {
        return new PostRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
