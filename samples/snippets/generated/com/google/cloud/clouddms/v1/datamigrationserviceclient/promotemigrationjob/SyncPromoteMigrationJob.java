/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.clouddms.v1.samples;

// [START clouddms_v1_generated_datamigrationserviceclient_promotemigrationjob_sync]
import com.google.cloud.clouddms.v1.DataMigrationServiceClient;
import com.google.cloud.clouddms.v1.MigrationJob;
import com.google.cloud.clouddms.v1.MigrationJobName;
import com.google.cloud.clouddms.v1.PromoteMigrationJobRequest;

public class SyncPromoteMigrationJob {

  public static void main(String[] args) throws Exception {
    syncPromoteMigrationJob();
  }

  public static void syncPromoteMigrationJob() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataMigrationServiceClient dataMigrationServiceClient =
        DataMigrationServiceClient.create()) {
      PromoteMigrationJobRequest request =
          PromoteMigrationJobRequest.newBuilder()
              .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
              .build();
      MigrationJob response = dataMigrationServiceClient.promoteMigrationJobAsync(request).get();
    }
  }
}
// [END clouddms_v1_generated_datamigrationserviceclient_promotemigrationjob_sync]
