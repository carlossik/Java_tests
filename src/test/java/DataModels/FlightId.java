package DataModels;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties
public class FlightId
{
        private String clientWeightedHardPostViewConversions;

        private String distinctDeliveryDates;

        private String clientWeightedSoftConversions;

        private String pacingCost;

        private String marginAmount;

        private String clientClicks;

        private String clientWeightedSoftPostViewConversions;

        private String viewed100Percent;

        @JsonIgnoreProperties(ignoreUnknown = true)
        private String cumulativeDelivery;

        private String platformCostFlightCurrency;

        private String softPostViewConversions;

        private String techCostFlightCurrency;

        private String otherCostFlightCurrency;

        private PerformanceValuesInCost performanceValuesInCost;

        private String vendorDisplayGroupMViewable;

        private String averagePacingSpend;

        private String otherCostPlatformCurrency;

        private String clicks;

        private String platformCost;

        private String clientPacingSpend;

        private String margin;

        private String maxPlatformDeliveryDate;

        private String impressions;

        private String clientWeightedSoftPostClickConversions;

        private String softPostClickConversions;

        private String techCostPlatformCurrency;

        private String pacingSpend;

        private String unlockedDays;

        private String cost;

        private String avgTechMultiplier;

        private String softConversions;

        private String vendorVideoViewable;

        private String hardConversions;

        private String clientImpressions;

        private String vendorVideoGroupMViewable;

        private String minPlatformDeliveryDate;

        private String clientWeightedHardConversions;

        private PerformanceValues performanceValues;

        private String net;

        @JsonIgnoreProperties(ignoreUnknown = true)
        private Date maxClientDeliveryDate;

        private String vendorDisplayViewable;

        private PerformanceValuesInCost clientPerformanceValuesInCost;

        private VcpmPerformanceValuesInCost vcpmPerformanceValuesInCost;

        private ClientPerformanceValues clientPerformanceValues;

        private String clientTotalRevenue;

        private String dataFeesPlatformCurrency;

        private String hardPostViewConversions;

        private String clientWeightedHardPostClickConversions;

        private String spend;

        private String hardPostClickConversions;

        @JsonIgnoreProperties(ignoreUnknown = true)
        private double clientPacingCost;

        private String focSpend;

        private String dataFeesFlightCurrency;

        public String getClientWeightedHardPostViewConversions ()
        {
                return clientWeightedHardPostViewConversions;
        }

        public void setClientWeightedHardPostViewConversions (String clientWeightedHardPostViewConversions)
        {
                this.clientWeightedHardPostViewConversions = clientWeightedHardPostViewConversions;
        }

        public String getDistinctDeliveryDates ()
        {
                return distinctDeliveryDates;
        }

        public void setDistinctDeliveryDates (String distinctDeliveryDates)
        {
                this.distinctDeliveryDates = distinctDeliveryDates;
        }

        public String getClientWeightedSoftConversions ()
        {
                return clientWeightedSoftConversions;
        }

        public void setClientWeightedSoftConversions (String clientWeightedSoftConversions)
        {
                this.clientWeightedSoftConversions = clientWeightedSoftConversions;
        }

        public String getPacingCost ()
        {
                return pacingCost;
        }

        public void setPacingCost (String pacingCost)
        {
                this.pacingCost = pacingCost;
        }

        public String getMarginAmount ()
        {
                return marginAmount;
        }

        public void setMarginAmount (String marginAmount)
        {
                this.marginAmount = marginAmount;
        }

        public String getClientClicks ()
        {
                return clientClicks;
        }

        public void setClientClicks (String clientClicks)
        {
                this.clientClicks = clientClicks;
        }

        public String getClientWeightedSoftPostViewConversions ()
        {
                return clientWeightedSoftPostViewConversions;
        }

        public void setClientWeightedSoftPostViewConversions (String clientWeightedSoftPostViewConversions)
        {
                this.clientWeightedSoftPostViewConversions = clientWeightedSoftPostViewConversions;
        }

        public String getViewed100Percent ()
        {
                return viewed100Percent;
        }

        public void setViewed100Percent (String viewed100Percent)
        {
                this.viewed100Percent = viewed100Percent;
        }

        public String getCumulativeDelivery ()
{
        return cumulativeDelivery;
}

        public void setCumulativeDelivery (String cumulativeDelivery)
        {
                this.cumulativeDelivery = cumulativeDelivery;
        }

        public String getPlatformCostFlightCurrency ()
        {
                return platformCostFlightCurrency;
        }

        public void setPlatformCostFlightCurrency (String platformCostFlightCurrency)
        {
                this.platformCostFlightCurrency = platformCostFlightCurrency;
        }

        public String getSoftPostViewConversions ()
        {
                return softPostViewConversions;
        }

        public void setSoftPostViewConversions (String softPostViewConversions)
        {
                this.softPostViewConversions = softPostViewConversions;
        }

        public String getTechCostFlightCurrency ()
        {
                return techCostFlightCurrency;
        }

        public void setTechCostFlightCurrency (String techCostFlightCurrency)
        {
                this.techCostFlightCurrency = techCostFlightCurrency;
        }

        public String getOtherCostFlightCurrency ()
        {
                return otherCostFlightCurrency;
        }

        public void setOtherCostFlightCurrency (String otherCostFlightCurrency)
        {
                this.otherCostFlightCurrency = otherCostFlightCurrency;
        }

        public PerformanceValuesInCost getPerformanceValuesInCost ()
        {
                return performanceValuesInCost;
        }

        public void setPerformanceValuesInCost (PerformanceValuesInCost performanceValuesInCost)
        {
                this.performanceValuesInCost = performanceValuesInCost;
        }

        public String getVendorDisplayGroupMViewable ()
        {
                return vendorDisplayGroupMViewable;
        }

        public void setVendorDisplayGroupMViewable (String vendorDisplayGroupMViewable)
        {
                this.vendorDisplayGroupMViewable = vendorDisplayGroupMViewable;
        }

        public String getAveragePacingSpend ()
        {
                return averagePacingSpend;
        }

        public void setAveragePacingSpend (String averagePacingSpend)
        {
                this.averagePacingSpend = averagePacingSpend;
        }

        public String getOtherCostPlatformCurrency ()
        {
                return otherCostPlatformCurrency;
        }

        public void setOtherCostPlatformCurrency (String otherCostPlatformCurrency)
        {
                this.otherCostPlatformCurrency = otherCostPlatformCurrency;
        }

        public String getClicks ()
        {
                return clicks;
        }

        public void setClicks (String clicks)
        {
                this.clicks = clicks;
        }

        public String getPlatformCost ()
        {
                return platformCost;
        }

        public void setPlatformCost (String platformCost)
        {
                this.platformCost = platformCost;
        }

        public String getClientPacingSpend ()
        {
                return clientPacingSpend;
        }

        public void setClientPacingSpend (String clientPacingSpend)
        {
                this.clientPacingSpend = clientPacingSpend;
        }

        public String getMargin ()
        {
                return margin;
        }

        public void setMargin (String margin)
        {
                this.margin = margin;
        }

        public String getMaxPlatformDeliveryDate ()
        {
                return maxPlatformDeliveryDate;
        }

        public void setMaxPlatformDeliveryDate (String maxPlatformDeliveryDate)
        {
                this.maxPlatformDeliveryDate = maxPlatformDeliveryDate;
        }

        public String getImpressions ()
        {
                return impressions;
        }

        public void setImpressions (String impressions)
        {
                this.impressions = impressions;
        }

        public String getClientWeightedSoftPostClickConversions ()
        {
                return clientWeightedSoftPostClickConversions;
        }

        public void setClientWeightedSoftPostClickConversions (String clientWeightedSoftPostClickConversions)
        {
                this.clientWeightedSoftPostClickConversions = clientWeightedSoftPostClickConversions;
        }

        public String getSoftPostClickConversions ()
        {
                return softPostClickConversions;
        }

        public void setSoftPostClickConversions (String softPostClickConversions)
        {
                this.softPostClickConversions = softPostClickConversions;
        }

        public String getTechCostPlatformCurrency ()
        {
                return techCostPlatformCurrency;
        }

        public void setTechCostPlatformCurrency (String techCostPlatformCurrency)
        {
                this.techCostPlatformCurrency = techCostPlatformCurrency;
        }

        public String getPacingSpend ()
        {
                return pacingSpend;
        }

        public void setPacingSpend (String pacingSpend)
        {
                this.pacingSpend = pacingSpend;
        }

        public String getUnlockedDays ()
        {
                return unlockedDays;
        }

        public void setUnlockedDays (String unlockedDays)
        {
                this.unlockedDays = unlockedDays;
        }

        public String getCost ()
        {
                return cost;
        }

        public void setCost (String cost)
        {
                this.cost = cost;
        }

        public String getAvgTechMultiplier ()
        {
                return avgTechMultiplier;
        }

        public void setAvgTechMultiplier (String avgTechMultiplier)
        {
                this.avgTechMultiplier = avgTechMultiplier;
        }

        public String getSoftConversions ()
        {
                return softConversions;
        }

        public void setSoftConversions (String softConversions)
        {
                this.softConversions = softConversions;
        }

        public String getVendorVideoViewable ()
        {
                return vendorVideoViewable;
        }

        public void setVendorVideoViewable (String vendorVideoViewable)
        {
                this.vendorVideoViewable = vendorVideoViewable;
        }

        public String getHardConversions ()
        {
                return hardConversions;
        }

        public void setHardConversions (String hardConversions)
        {
                this.hardConversions = hardConversions;
        }

        public String getClientImpressions ()
        {
                return clientImpressions;
        }

        public void setClientImpressions (String clientImpressions)
        {
                this.clientImpressions = clientImpressions;
        }

        public String getVendorVideoGroupMViewable ()
        {
                return vendorVideoGroupMViewable;
        }

        public void setVendorVideoGroupMViewable (String vendorVideoGroupMViewable)
        {
                this.vendorVideoGroupMViewable = vendorVideoGroupMViewable;
        }

        public String getMinPlatformDeliveryDate ()
        {
                return minPlatformDeliveryDate;
        }

        public void setMinPlatformDeliveryDate (String minPlatformDeliveryDate)
        {
                this.minPlatformDeliveryDate = minPlatformDeliveryDate;
        }

        public String getClientWeightedHardConversions ()
        {
                return clientWeightedHardConversions;
        }

        public void setClientWeightedHardConversions (String clientWeightedHardConversions)
        {
                this.clientWeightedHardConversions = clientWeightedHardConversions;
        }

        public PerformanceValues getPerformanceValues ()
        {
                return performanceValues;
        }

        public void setPerformanceValues (PerformanceValues performanceValues)
        {
                this.performanceValues = performanceValues;
        }

        public String getNet ()
        {
                return net;
        }

        public void setNet (String net)
        {
                this.net = net;
        }

        public Date getMaxClientDeliveryDate ()
{
        return maxClientDeliveryDate;
}

        public void setMaxClientDeliveryDate (Date maxClientDeliveryDate)
        {
                this.maxClientDeliveryDate = maxClientDeliveryDate;
        }

        public String getVendorDisplayViewable ()
        {
                return vendorDisplayViewable;
        }

        public void setVendorDisplayViewable (String vendorDisplayViewable)
        {
                this.vendorDisplayViewable = vendorDisplayViewable;
        }

        public PerformanceValuesInCost getClientPerformanceValuesInCost ()
        {
                return clientPerformanceValuesInCost;
        }

        public void setClientPerformanceValuesInCost (PerformanceValuesInCost clientPerformanceValuesInCost)
        {
                this.clientPerformanceValuesInCost = clientPerformanceValuesInCost;
        }

        public VcpmPerformanceValuesInCost getVcpmPerformanceValuesInCost ()
        {
                return vcpmPerformanceValuesInCost;
        }

        public void setVcpmPerformanceValuesInCost (VcpmPerformanceValuesInCost vcpmPerformanceValuesInCost)
        {
                this.vcpmPerformanceValuesInCost = vcpmPerformanceValuesInCost;
        }

        public ClientPerformanceValues getClientPerformanceValues ()
        {
                return clientPerformanceValues;
        }

        public void setClientPerformanceValues (ClientPerformanceValues clientPerformanceValues)
        {
                this.clientPerformanceValues = clientPerformanceValues;
        }

        public String getClientTotalRevenue ()
        {
                return clientTotalRevenue;
        }

        public void setClientTotalRevenue (String clientTotalRevenue)
        {
                this.clientTotalRevenue = clientTotalRevenue;
        }

        public String getDataFeesPlatformCurrency ()
        {
                return dataFeesPlatformCurrency;
        }

        public void setDataFeesPlatformCurrency (String dataFeesPlatformCurrency)
        {
                this.dataFeesPlatformCurrency = dataFeesPlatformCurrency;
        }

        public String getHardPostViewConversions ()
        {
                return hardPostViewConversions;
        }

        public void setHardPostViewConversions (String hardPostViewConversions)
        {
                this.hardPostViewConversions = hardPostViewConversions;
        }

        public String getClientWeightedHardPostClickConversions ()
        {
                return clientWeightedHardPostClickConversions;
        }

        public void setClientWeightedHardPostClickConversions (String clientWeightedHardPostClickConversions)
        {
                this.clientWeightedHardPostClickConversions = clientWeightedHardPostClickConversions;
        }

        public String getSpend ()
        {
                return spend;
        }

        public void setSpend (String spend)
        {
                this.spend = spend;
        }

        public String getHardPostClickConversions ()
        {
                return hardPostClickConversions;
        }

        public void setHardPostClickConversions (String hardPostClickConversions)
        {
                this.hardPostClickConversions = hardPostClickConversions;
        }

        public double getClientPacingCost ()
{
        return clientPacingCost;
}

        public void setClientPacingCost (double clientPacingCost)
        {
                this.clientPacingCost = clientPacingCost;
        }

        public String getFocSpend ()
        {
                return focSpend;
        }

        public void setFocSpend (String focSpend)
        {
                this.focSpend = focSpend;
        }

        public String getDataFeesFlightCurrency ()
        {
                return dataFeesFlightCurrency;
        }

        public void setDataFeesFlightCurrency (String dataFeesFlightCurrency)
        {
                this.dataFeesFlightCurrency = dataFeesFlightCurrency;
        }

        @Override
        public String toString()
        {
                return "ClassPojo [clientWeightedHardPostViewConversions = "+clientWeightedHardPostViewConversions+", distinctDeliveryDates = "+distinctDeliveryDates+", clientWeightedSoftConversions = "+clientWeightedSoftConversions+", pacingCost = "+pacingCost+", marginAmount = "+marginAmount+", clientClicks = "+clientClicks+", clientWeightedSoftPostViewConversions = "+clientWeightedSoftPostViewConversions+", viewed100Percent = "+viewed100Percent+", cumulativeDelivery = "+cumulativeDelivery+", platformCostFlightCurrency = "+platformCostFlightCurrency+", softPostViewConversions = "+softPostViewConversions+", techCostFlightCurrency = "+techCostFlightCurrency+", otherCostFlightCurrency = "+otherCostFlightCurrency+", performanceValuesInCost = "+performanceValuesInCost+", vendorDisplayGroupMViewable = "+vendorDisplayGroupMViewable+", averagePacingSpend = "+averagePacingSpend+", otherCostPlatformCurrency = "+otherCostPlatformCurrency+", clicks = "+clicks+", platformCost = "+platformCost+", clientPacingSpend = "+clientPacingSpend+", margin = "+margin+", maxPlatformDeliveryDate = "+maxPlatformDeliveryDate+", impressions = "+impressions+", clientWeightedSoftPostClickConversions = "+clientWeightedSoftPostClickConversions+", softPostClickConversions = "+softPostClickConversions+", techCostPlatformCurrency = "+techCostPlatformCurrency+", pacingSpend = "+pacingSpend+", unlockedDays = "+unlockedDays+", cost = "+cost+", avgTechMultiplier = "+avgTechMultiplier+", softConversions = "+softConversions+", vendorVideoViewable = "+vendorVideoViewable+", hardConversions = "+hardConversions+", clientImpressions = "+clientImpressions+", vendorVideoGroupMViewable = "+vendorVideoGroupMViewable+", minPlatformDeliveryDate = "+minPlatformDeliveryDate+", clientWeightedHardConversions = "+clientWeightedHardConversions+", performanceValues = "+performanceValues+", net = "+net+", maxClientDeliveryDate = "+maxClientDeliveryDate+", vendorDisplayViewable = "+vendorDisplayViewable+", clientPerformanceValuesInCost = "+clientPerformanceValuesInCost+", vcpmPerformanceValuesInCost = "+vcpmPerformanceValuesInCost+", clientPerformanceValues = "+clientPerformanceValues+", clientTotalRevenue = "+clientTotalRevenue+", dataFeesPlatformCurrency = "+dataFeesPlatformCurrency+", hardPostViewConversions = "+hardPostViewConversions+", clientWeightedHardPostClickConversions = "+clientWeightedHardPostClickConversions+", spend = "+spend+", hardPostClickConversions = "+hardPostClickConversions+", clientPacingCost = "+clientPacingCost+", focSpend = "+focSpend+", dataFeesFlightCurrency = "+dataFeesFlightCurrency+"]";
        }
}