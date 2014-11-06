/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.oort.model

class NoopClusterProvider implements ClusterProvider<Cluster> {

  @Override
  Map<String, Set<Cluster>> getClusters() {
    Collections.emptyMap()
  }

  @Override
  Map<String, Set<Cluster>> getClusters(String application) {
    Collections.emptyMap()
  }

  @Override
  Set<Cluster> getClusters(String application, String account) {
    Collections.emptySet()
  }

  @Override
  Cluster getCluster(String application, String account, String name) {
    null
  }
}
