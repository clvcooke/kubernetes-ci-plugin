/*
 * Copyright 2016 ElasticBox
 *
 * Licensed under the Apache License, Version 2.0, <LICENSE-APACHE or http://apache.org/licenses/LICENSE-2.0>
 * or the MIT license <LICENSE-MIT or http://opensource.org/licenses/MIT> , at your option.
 * This file may not be copied, modified, or distributed except according to those terms.
 */

package com.elasticbox.jenkins.k8s.repositories;

import com.elasticbox.jenkins.k8s.repositories.error.RepositoryException;
import io.fabric8.kubernetes.api.model.ReplicationController;

import java.util.Map;

public interface ReplicationControllerRepository {

    void create(String kubeName, String namespace, ReplicationController replicationController)
            throws RepositoryException;

    void create(String kubeName, String namespace, ReplicationController controller, Map<String, String> labels)
            throws RepositoryException;

    void delete(String kubeName, String namespace, ReplicationController replController)
            throws RepositoryException;
}
