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
 * The interface for the Base Education User Request.
 */
public interface IBaseEducationUserRequest extends IHttpRequest {

    /**
     * Gets the EducationUser from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<EducationUser> callback);

    /**
     * Gets the EducationUser from the service
     * @return The EducationUser from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    EducationUser get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EducationUser with a source
     * @param sourceEducationUser The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final EducationUser sourceEducationUser, final ICallback<EducationUser> callback);

    /**
     * Patches this EducationUser with a source
     * @param sourceEducationUser The source object with updates
     * @return The updated EducationUser
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    EducationUser patch(final EducationUser sourceEducationUser) throws ClientException;

    /**
     * Posts a EducationUser with a new object
     * @param newEducationUser The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final EducationUser newEducationUser, final ICallback<EducationUser> callback);

    /**
     * Posts a EducationUser with a new object
     * @param newEducationUser The new object to create
     * @return The created EducationUser
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    EducationUser post(final EducationUser newEducationUser) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseEducationUserRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseEducationUserRequest expand(final String value);

}

