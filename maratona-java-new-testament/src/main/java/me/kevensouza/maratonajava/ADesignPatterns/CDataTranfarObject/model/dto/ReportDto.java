package me.kevensouza.maratonajava.ADesignPatterns.CDataTranfarObject.model.dto;

public class ReportDto {
    private String AircraftName;
    private String PersonName;
    private short PersonAge;

    public static final class ReportDtoBuilder {
        private String AircraftName;
        private String PersonName;
        private short PersonAge;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder aReportDto() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder AircraftName(String AircraftName) {
            this.AircraftName = AircraftName;
            return this;
        }

        public ReportDtoBuilder PersonName(String PersonName) {
            this.PersonName = PersonName;
            return this;
        }

        public ReportDtoBuilder PersonAge(short PersonAge) {
            this.PersonAge = PersonAge;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.PersonAge = this.PersonAge;
            reportDto.AircraftName = this.AircraftName;
            reportDto.PersonName = this.PersonName;
            return reportDto;
        }
    }
}
