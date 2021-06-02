/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.ModelSnapshot
public final class ModelSnapshot implements ToJsonp {
	@Nullable
	private final String description;

	private final String jobId;

	@Nullable
	private final JsonValue latestRecordTimeStamp;

	@Nullable
	private final JsonValue latestResultTimeStamp;

	private final String minVersion;

	@Nullable
	private final ModelSizeStats modelSizeStats;

	private final Boolean retain;

	private final Number snapshotDocCount;

	private final String snapshotId;

	private final JsonValue timestamp;

	// ---------------------------------------------------------------------------------------------

	protected ModelSnapshot(Builder builder) {

		this.description = builder.description;
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.latestRecordTimeStamp = builder.latestRecordTimeStamp;
		this.latestResultTimeStamp = builder.latestResultTimeStamp;
		this.minVersion = Objects.requireNonNull(builder.minVersion, "min_version");
		this.modelSizeStats = builder.modelSizeStats;
		this.retain = Objects.requireNonNull(builder.retain, "retain");
		this.snapshotDocCount = Objects.requireNonNull(builder.snapshotDocCount, "snapshot_doc_count");
		this.snapshotId = Objects.requireNonNull(builder.snapshotId, "snapshot_id");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");

	}

	/**
	 * An optional description of the job.
	 *
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * A numerical character string that uniquely identifies the job that the
	 * snapshot was created for.
	 *
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * The timestamp of the latest processed record.
	 *
	 * API name: {@code latest_record_time_stamp}
	 */
	@Nullable
	public JsonValue latestRecordTimeStamp() {
		return this.latestRecordTimeStamp;
	}

	/**
	 * The timestamp of the latest bucket result.
	 *
	 * API name: {@code latest_result_time_stamp}
	 */
	@Nullable
	public JsonValue latestResultTimeStamp() {
		return this.latestResultTimeStamp;
	}

	/**
	 * The minimum version required to be able to restore the model snapshot.
	 *
	 * API name: {@code min_version}
	 */
	public String minVersion() {
		return this.minVersion;
	}

	/**
	 * Summary information describing the model.
	 *
	 * API name: {@code model_size_stats}
	 */
	@Nullable
	public ModelSizeStats modelSizeStats() {
		return this.modelSizeStats;
	}

	/**
	 * If true, this snapshot will not be deleted during automatic cleanup of
	 * snapshots older than model_snapshot_retention_days. However, this snapshot
	 * will be deleted when the job is deleted. The default value is false.
	 *
	 * API name: {@code retain}
	 */
	public Boolean retain() {
		return this.retain;
	}

	/**
	 * For internal use only.
	 *
	 * API name: {@code snapshot_doc_count}
	 */
	public Number snapshotDocCount() {
		return this.snapshotDocCount;
	}

	/**
	 * A numerical character string that uniquely identifies the model snapshot.
	 *
	 * API name: {@code snapshot_id}
	 */
	public String snapshotId() {
		return this.snapshotId;
	}

	/**
	 * The creation timestamp for the snapshot.
	 *
	 * API name: {@code timestamp}
	 */
	public JsonValue timestamp() {
		return this.timestamp;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}

		generator.writeKey("job_id");
		generator.write(this.jobId);

		if (this.latestRecordTimeStamp != null) {

			generator.writeKey("latest_record_time_stamp");
			generator.write(this.latestRecordTimeStamp);

		}
		if (this.latestResultTimeStamp != null) {

			generator.writeKey("latest_result_time_stamp");
			generator.write(this.latestResultTimeStamp);

		}

		generator.writeKey("min_version");
		generator.write(this.minVersion);

		if (this.modelSizeStats != null) {

			generator.writeKey("model_size_stats");
			this.modelSizeStats.toJsonp(generator, mapper);

		}

		generator.writeKey("retain");
		generator.write(this.retain);

		generator.writeKey("snapshot_doc_count");
		generator.write(this.snapshotDocCount.doubleValue());

		generator.writeKey("snapshot_id");
		generator.write(this.snapshotId);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModelSnapshot}.
	 */
	public static class Builder implements ObjectBuilder<ModelSnapshot> {
		@Nullable
		private String description;

		private String jobId;

		@Nullable
		private JsonValue latestRecordTimeStamp;

		@Nullable
		private JsonValue latestResultTimeStamp;

		private String minVersion;

		@Nullable
		private ModelSizeStats modelSizeStats;

		private Boolean retain;

		private Number snapshotDocCount;

		private String snapshotId;

		private JsonValue timestamp;

		/**
		 * An optional description of the job.
		 *
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * A numerical character string that uniquely identifies the job that the
		 * snapshot was created for.
		 *
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * The timestamp of the latest processed record.
		 *
		 * API name: {@code latest_record_time_stamp}
		 */
		public Builder latestRecordTimeStamp(@Nullable JsonValue value) {
			this.latestRecordTimeStamp = value;
			return this;
		}

		/**
		 * The timestamp of the latest bucket result.
		 *
		 * API name: {@code latest_result_time_stamp}
		 */
		public Builder latestResultTimeStamp(@Nullable JsonValue value) {
			this.latestResultTimeStamp = value;
			return this;
		}

		/**
		 * The minimum version required to be able to restore the model snapshot.
		 *
		 * API name: {@code min_version}
		 */
		public Builder minVersion(String value) {
			this.minVersion = value;
			return this;
		}

		/**
		 * Summary information describing the model.
		 *
		 * API name: {@code model_size_stats}
		 */
		public Builder modelSizeStats(@Nullable ModelSizeStats value) {
			this.modelSizeStats = value;
			return this;
		}

		/**
		 * Summary information describing the model.
		 *
		 * API name: {@code model_size_stats}
		 */
		public Builder modelSizeStats(Function<ModelSizeStats.Builder, ObjectBuilder<ModelSizeStats>> fn) {
			return this.modelSizeStats(fn.apply(new ModelSizeStats.Builder()).build());
		}

		/**
		 * If true, this snapshot will not be deleted during automatic cleanup of
		 * snapshots older than model_snapshot_retention_days. However, this snapshot
		 * will be deleted when the job is deleted. The default value is false.
		 *
		 * API name: {@code retain}
		 */
		public Builder retain(Boolean value) {
			this.retain = value;
			return this;
		}

		/**
		 * For internal use only.
		 *
		 * API name: {@code snapshot_doc_count}
		 */
		public Builder snapshotDocCount(Number value) {
			this.snapshotDocCount = value;
			return this;
		}

		/**
		 * A numerical character string that uniquely identifies the model snapshot.
		 *
		 * API name: {@code snapshot_id}
		 */
		public Builder snapshotId(String value) {
			this.snapshotId = value;
			return this;
		}

		/**
		 * The creation timestamp for the snapshot.
		 *
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(JsonValue value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link ModelSnapshot}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModelSnapshot build() {

			return new ModelSnapshot(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ModelSnapshot
	 */
	public static final JsonpValueParser<ModelSnapshot> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ModelSnapshot::setupModelSnapshotParser);

	protected static void setupModelSnapshotParser(DelegatingJsonpValueParser<ModelSnapshot.Builder> op) {

		op.add(Builder::description, JsonpValueParser.stringParser(), "description");
		op.add(Builder::jobId, JsonpValueParser.stringParser(), "job_id");
		op.add(Builder::latestRecordTimeStamp, JsonpValueParser.jsonValueParser(), "latest_record_time_stamp");
		op.add(Builder::latestResultTimeStamp, JsonpValueParser.jsonValueParser(), "latest_result_time_stamp");
		op.add(Builder::minVersion, JsonpValueParser.stringParser(), "min_version");
		op.add(Builder::modelSizeStats, ModelSizeStats.JSONP_PARSER, "model_size_stats");
		op.add(Builder::retain, JsonpValueParser.booleanParser(), "retain");
		op.add(Builder::snapshotDocCount, JsonpValueParser.numberParser(), "snapshot_doc_count");
		op.add(Builder::snapshotId, JsonpValueParser.stringParser(), "snapshot_id");
		op.add(Builder::timestamp, JsonpValueParser.jsonValueParser(), "timestamp");

	}

}