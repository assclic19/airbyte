import React from "react";
import { useIntl } from "react-intl";

import { FlexContainer } from "components/ui/Flex";

import styles from "./LoadingPage.module.scss";

export const LoadingPage: React.FC = () => {
  const { formatMessage } = useIntl();
  return <FlexContainer alignItems="center" justifyContent="center" className={styles.loadingPage} />;
};
