/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jayway.restassured.specification;

import com.jayway.restassured.response.Response;

import java.net.URI;
import java.net.URL;
import java.util.Map;

public interface RequestSender {
    /**
     * Perform a GET request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters. E.g. if path is "/book/{hotelId}/{roomNumber}" you can do <code>get("/book/{hotelName}/{roomNumber}", "Hotels R Us", 22);</code>.
     * @return The response of the request.
     */
    Response get(String path, Object... pathParams);

    /**
     * Perform a GET request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters.
     * @return The response of the request.
     */
    Response get(String path, Map<String, ?> pathParams);

    /**
     * Perform a POST request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters. E.g. if path is "/book/{hotelId}/{roomNumber}" you can do <code>post("/book/{hotelName}/{roomNumber}", "Hotels R Us", 22);</code>.
     * @return The response of the request.
     */
    Response post(String path, Object... pathParams);

    /**
     * Perform a POST request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters.
     * @return The response of the request.
     */
    Response post(String path, Map<String, ?> pathParams);

    /**
     * Perform a PUT request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters. E.g. if path is "/book/{hotelId}/{roomNumber}" you can do <code>put("/book/{hotelName}/{roomNumber}", "Hotels R Us", 22);</code>.
     * @return The response of the request.
     */
    Response put(String path, Object... pathParams);

    /**
     * Perform a PUT request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters.
     * @return The response of the request.
     */
    Response put(String path, Map<String, ?> pathParams);

    /**
     * Perform a DELETE request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters. E.g. if path is "/book/{hotelId}/{roomNumber}" you can do <code>delete("/book/{hotelName}/{roomNumber}", "Hotels R Us", 22);</code>.
     * @return The response of the request.
     */
    Response delete(String path, Object... pathParams);

    /**
     * Perform a DELETE request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters.
     * @return The response of the request.
     */
    Response delete(String path, Map<String, ?> pathParams);

    /**
     * Perform a HEAD request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters. E.g. if path is "/book/{hotelId}/{roomNumber}" you can do <code>head("/book/{hotelName}/{roomNumber}", "Hotels R Us", 22);</code>.
     * @return The response of the request.
     */
    Response head(String path, Object... pathParams);

    /**
     * Perform a HEAD request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters.
     * @return The response of the request.
     */
    Response head(String path, Map<String, ?> pathParams);

    /**
     * Perform a PATCH request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters. E.g. if path is "/book/{hotelId}/{roomNumber}" you can do <code>head("/book/{hotelName}/{roomNumber}", "Hotels R Us", 22);</code>.
     * @return The response of the request.
     */
    Response patch(String path, Object... pathParams);

    /**
     * Perform a PATCH request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters.
     * @return The response of the request.
     */
    Response patch(String path, Map<String, ?> pathParams);

    /**
     * Perform a OPTIONS request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters. E.g. if path is "/book/{hotelId}/{roomNumber}" you can do <code>head("/book/{hotelName}/{roomNumber}", "Hotels R Us", 22);</code>.
     * @return The response of the request.
     */
    Response options(String path, Object... pathParams);


    /**
     * Perform a OPTIONS request to a <code>path</code>. Normally the path doesn't have to be fully-qualified e.g. you don't need to
     * specify the path as <tt>http://localhost:8080/path</tt>. In this case it's enough to use <tt>/path</tt>.
     *
     * @param path       The path to send the request to.
     * @param pathParams The path parameters.
     * @return The response of the request.
     */
    Response options(String path, Map<String, ?> pathParams);

    /**
     * Perform a GET request to a <code>uri</code>.
     *
     * @param uri The uri to send the request to.
     * @return The response of the GET request.
     */
    Response get(URI uri);

    /**
     * Perform a POST request to a <code>uri</code>.
     *
     * @param uri The uri to send the request to.
     * @return The response of the request.
     */
    Response post(URI uri);

    /**
     * Perform a PUT request to a <code>uri</code>.
     *
     * @param uri The uri to send the request to.
     * @return The response of the request.
     */
    Response put(URI uri);

    /**
     * Perform a DELETE request to a <code>uri</code>.
     *
     * @param uri The uri to send the request to.
     * @return The response of the request.
     */
    Response delete(URI uri);

    /**
     * Perform a HEAD request to a <code>uri</code>.
     *
     * @param uri The uri to send the request to.
     * @return The response of the request.
     */
    Response head(URI uri);

    /**
     * Perform a PATCH request to a <code>uri</code>.
     *
     * @param uri The uri to send the request to.
     * @return The response of the request.
     */
    Response patch(URI uri);

    /**
     * Perform a OPTIONS request to a <code>uri</code>.
     *
     * @param uri The uri to send the request to.
     * @return The response of the request.
     */
    Response options(URI uri);

    /**
     * Perform a GET request to a <code>url</code>.
     *
     * @param url The url to send the request to.
     * @return The response of the GET request.
     */
    Response get(URL url);

    /**
     * Perform a POST request to a <code>url</code>.
     *
     * @param url The url to send the request to.
     * @return The response of the request.
     */
    Response post(URL url);

    /**
     * Perform a PUT request to a <code>url</code>.
     *
     * @param url The url to send the request to.
     * @return The response of the request.
     */
    Response put(URL url);

    /**
     * Perform a DELETE request to a <code>url</code>.
     *
     * @param url The url to send the request to.
     * @return The response of the request.
     */
    Response delete(URL url);

    /**
     * Perform a HEAD request to a <code>url</code>.
     *
     * @param url The url to send the request to.
     * @return The response of the request.
     */
    Response head(URL url);

    /**
     * Perform a PATCH request to a <code>url</code>.
     *
     * @param url The url to send the request to.
     * @return The response of the request.
     */
    Response patch(URL url);

    /**
     * Perform a OPTIONS request to a <code>url</code>.
     *
     * @param url The url to send the request to.
     * @return The response of the request.
     */
    Response options(URL url);

    /**
     * Perform a GET request to the statically configured path (by default <code>http://localhost:8080</code>).
     *
     * @return The response of the GET request.
     */
    Response get();

    /**
     * Perform a POST request to the statically configured path (by default <code>http://localhost:8080</code>).
     *
     * @return The response of the request.
     */
    Response post();

    /**
     * Perform a PUT request to the statically configured path (by default <code>http://localhost:8080</code>).
     *
     * @return The response of the request.
     */
    Response put();

    /**
     * Perform a DELETE request to the statically configured path (by default <code>http://localhost:8080</code>).
     *
     * @return The response of the request.
     */
    Response delete();

    /**
     * Perform a HEAD request to the statically configured path (by default <code>http://localhost:8080</code>).
     *
     * @return The response of the request.
     */
    Response head();

    /**
     * Perform a PATCH request to the statically configured path (by default <code>http://localhost:8080</code>).
     *
     * @return The response of the request.
     */
    Response patch();

    /**
     * Perform a OPTIONS request to the statically configured path (by default <code>http://localhost:8080</code>).
     *
     * @return The response of the request.
     */
    Response options();
}