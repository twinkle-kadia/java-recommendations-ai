/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/user_event_service.proto

package com.google.cloud.recommendationengine.v1beta1;

public final class UserEventServiceOuterClass {
  private UserEventServiceOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_WriteUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_WriteUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/cloud/recommendationengine/v1be"
          + "ta1/user_event_service.proto\022)google.clo"
          + "ud.recommendationengine.v1beta1\032\034google/"
          + "api/annotations.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/httpbody.prot"
          + "o\0326google/cloud/recommendationengine/v1b"
          + "eta1/import.proto\032:google/cloud/recommen"
          + "dationengine/v1beta1/user_event.proto\032#g"
          + "oogle/longrunning/operations.proto\032\037goog"
          + "le/protobuf/timestamp.proto\032\026google/type"
          + "/date.proto\032\027google/api/client.proto\"V\n\026"
          + "PurgeUserEventsRequest\022\023\n\006parent\030\001 \001(\tB\003"
          + "\340A\002\022\023\n\006filter\030\002 \001(\tB\003\340A\002\022\022\n\005force\030\003 \001(\010B"
          + "\003\340A\001\"b\n\027PurgeUserEventsMetadata\022\026\n\016opera"
          + "tion_name\030\001 \001(\t\022/\n\013create_time\030\002 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\"\210\001\n\027PurgeUserEv"
          + "entsResponse\022\033\n\023purged_events_count\030\001 \001("
          + "\003\022P\n\022user_events_sample\030\002 \003(\01324.google.c"
          + "loud.recommendationengine.v1beta1.UserEv"
          + "ent\"{\n\025WriteUserEventRequest\022\023\n\006parent\030\001"
          + " \001(\tB\003\340A\002\022M\n\nuser_event\030\002 \001(\01324.google.c"
          + "loud.recommendationengine.v1beta1.UserEv"
          + "entB\003\340A\002\"k\n\027CollectUserEventRequest\022\023\n\006p"
          + "arent\030\001 \001(\tB\003\340A\002\022\027\n\nuser_event\030\002 \001(\tB\003\340A"
          + "\002\022\020\n\003uri\030\003 \001(\tB\003\340A\001\022\020\n\003ets\030\004 \001(\003B\003\340A\001\"r\n"
          + "\025ListUserEventsRequest\022\023\n\006parent\030\001 \001(\tB\003"
          + "\340A\002\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_toke"
          + "n\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\"|\n\026Lis"
          + "tUserEventsResponse\022I\n\013user_events\030\001 \003(\013"
          + "24.google.cloud.recommendationengine.v1b"
          + "eta1.UserEvent\022\027\n\017next_page_token\030\002 \001(\t2"
          + "\323\013\n\020UserEventService\022\360\001\n\016WriteUserEvent\022"
          + "@.google.cloud.recommendationengine.v1be"
          + "ta1.WriteUserEventRequest\0324.google.cloud"
          + ".recommendationengine.v1beta1.UserEvent\""
          + "f\202\323\344\223\002`\"R/v1beta1/{parent=projects/*/loc"
          + "ations/*/catalogs/*/eventStores/*}/userE"
          + "vents:write:\nuser_event\022\312\001\n\020CollectUserE"
          + "vent\022B.google.cloud.recommendationengine"
          + ".v1beta1.CollectUserEventRequest\032\024.googl"
          + "e.api.HttpBody\"\\\202\323\344\223\002V\022T/v1beta1/{parent"
          + "=projects/*/locations/*/catalogs/*/event"
          + "Stores/*}/userEvents:collect\022\353\001\n\016ListUse"
          + "rEvents\022@.google.cloud.recommendationeng"
          + "ine.v1beta1.ListUserEventsRequest\032A.goog"
          + "le.cloud.recommendationengine.v1beta1.Li"
          + "stUserEventsResponse\"T\202\323\344\223\002N\022L/v1beta1/{"
          + "parent=projects/*/locations/*/catalogs/*"
          + "/eventStores/*}/userEvents\022\335\002\n\017PurgeUser"
          + "Events\022A.google.cloud.recommendationengi"
          + "ne.v1beta1.PurgeUserEventsRequest\032\035.goog"
          + "le.longrunning.Operation\"\347\001\202\323\344\223\002W\"R/v1be"
          + "ta1/{parent=projects/*/locations/*/catal"
          + "ogs/*/eventStores/*}/userEvents:purge:\001*"
          + "\312A\206\001\nAgoogle.cloud.recommendationengine."
          + "v1beta1.PurgeUserEventsResponse\022Agoogle."
          + "cloud.recommendationengine.v1beta1.Purge"
          + "UserEventsMetadata\022\327\002\n\020ImportUserEvents\022"
          + "B.google.cloud.recommendationengine.v1be"
          + "ta1.ImportUserEventsRequest\032\035.google.lon"
          + "grunning.Operation\"\337\001\202\323\344\223\002X\"S/v1beta1/{p"
          + "arent=projects/*/locations/*/catalogs/*/"
          + "eventStores/*}/userEvents:import:\001*\312A~\nB"
          + "google.cloud.recommendationengine.v1beta"
          + "1.ImportUserEventsResponse\0228google.cloud"
          + ".recommendationengine.v1beta1.ImportMeta"
          + "data\032W\312A#recommendationengine.googleapis"
          + ".com\322A.https://www.googleapis.com/auth/c"
          + "loud-platformB\304\001\n-com.google.cloud.recom"
          + "mendationengine.v1beta1P\001Z]google.golang"
          + ".org/genproto/googleapis/cloud/recommend"
          + "ationengine/v1beta1;recommendationengine"
          + "\242\002\005RECAI\252\002)Google.Cloud.RecommendationEn"
          + "gine.V1Beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.HttpBodyProto.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.Import.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.UserEventOuterClass.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "Force",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsMetadata_descriptor,
            new java.lang.String[] {
              "OperationName", "CreateTime",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_descriptor,
            new java.lang.String[] {
              "PurgedEventsCount", "UserEventsSample",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_WriteUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_recommendationengine_v1beta1_WriteUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_WriteUserEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEvent",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEvent", "Uri", "Ets",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_descriptor,
            new java.lang.String[] {
              "UserEvents", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.Import.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.UserEventOuterClass.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}