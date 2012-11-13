package com.thesis.panel;

public enum VisualizerSection {
	FIRST(0) {
		public Integer value() { return sectionId; }
	},
	SECOND(2) {
		public Integer value() { return sectionId; }
	}, 
	THIRD(4) {
		public Integer value() { return sectionId; }
	};

	protected Integer sectionId;

	private VisualizerSection(Integer id) {
		this.sectionId = id;
	}

	public static VisualizerSection fromValue(Integer value) {
		for(VisualizerSection section : VisualizerSection.values()) {
			if(section.sectionId.equals(value)) {
				return section;
			}
		}
		throw new IllegalArgumentException("No section was found for value: " + value);
	}

	public abstract Integer value();

}
