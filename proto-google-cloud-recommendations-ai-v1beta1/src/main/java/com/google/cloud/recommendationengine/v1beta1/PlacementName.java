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

package com.google.cloud.recommendationengine.v1beta1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class PlacementName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/catalogs/{catalog}/eventStores/{event_store}/placements/{placement}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String location;
  private final String catalog;
  private final String eventStore;
  private final String placement;

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getCatalog() {
    return catalog;
  }

  public String getEventStore() {
    return eventStore;
  }

  public String getPlacement() {
    return placement;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private PlacementName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    catalog = Preconditions.checkNotNull(builder.getCatalog());
    eventStore = Preconditions.checkNotNull(builder.getEventStore());
    placement = Preconditions.checkNotNull(builder.getPlacement());
  }

  public static PlacementName of(
      String project, String location, String catalog, String eventStore, String placement) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setCatalog(catalog)
        .setEventStore(eventStore)
        .setPlacement(placement)
        .build();
  }

  public static String format(
      String project, String location, String catalog, String eventStore, String placement) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setCatalog(catalog)
        .setEventStore(eventStore)
        .setPlacement(placement)
        .build()
        .toString();
  }

  public static PlacementName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "PlacementName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("catalog"),
        matchMap.get("event_store"),
        matchMap.get("placement"));
  }

  public static List<PlacementName> parseList(List<String> formattedStrings) {
    List<PlacementName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<PlacementName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (PlacementName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("location", location);
          fieldMapBuilder.put("catalog", catalog);
          fieldMapBuilder.put("eventStore", eventStore);
          fieldMapBuilder.put("placement", placement);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project",
        project,
        "location",
        location,
        "catalog",
        catalog,
        "event_store",
        eventStore,
        "placement",
        placement);
  }

  /** Builder for PlacementName. */
  public static class Builder {

    private String project;
    private String location;
    private String catalog;
    private String eventStore;
    private String placement;

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getCatalog() {
      return catalog;
    }

    public String getEventStore() {
      return eventStore;
    }

    public String getPlacement() {
      return placement;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setCatalog(String catalog) {
      this.catalog = catalog;
      return this;
    }

    public Builder setEventStore(String eventStore) {
      this.eventStore = eventStore;
      return this;
    }

    public Builder setPlacement(String placement) {
      this.placement = placement;
      return this;
    }

    private Builder() {}

    private Builder(PlacementName placementName) {
      project = placementName.project;
      location = placementName.location;
      catalog = placementName.catalog;
      eventStore = placementName.eventStore;
      placement = placementName.placement;
    }

    public PlacementName build() {
      return new PlacementName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PlacementName) {
      PlacementName that = (PlacementName) o;
      return (this.project.equals(that.project))
          && (this.location.equals(that.location))
          && (this.catalog.equals(that.catalog))
          && (this.eventStore.equals(that.eventStore))
          && (this.placement.equals(that.placement));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= location.hashCode();
    h *= 1000003;
    h ^= catalog.hashCode();
    h *= 1000003;
    h ^= eventStore.hashCode();
    h *= 1000003;
    h ^= placement.hashCode();
    return h;
  }
}